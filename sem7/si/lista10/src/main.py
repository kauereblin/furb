# Autor: Kaue Reblin

from cryptography.hazmat.primitives.asymmetric import rsa
from cryptography.hazmat.primitives import serialization
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.exceptions import InvalidSignature


# Função para gerar e armazenar chaves
def generate_and_store_keys(key_name):
    private_key = rsa.generate_private_key(
        public_exponent=65537,
        key_size=2048
    )
    
    # Serializar chave privada
    private_pem = private_key.private_bytes(
        encoding=serialization.Encoding.PEM,
        format=serialization.PrivateFormat.PKCS8,
        encryption_algorithm=serialization.NoEncryption()
    )
    
    # Salvar chave privada em um arquivo
    with open(f"./keys/{key_name}_private_key.pem", "wb") as private_file:
        private_file.write(private_pem)
    
    # Obter chave pública
    public_key = private_key.public_key()
    
    # Serializar chave pública
    public_pem = public_key.public_bytes(
        encoding=serialization.Encoding.PEM,
        format=serialization.PublicFormat.SubjectPublicKeyInfo
    )
    
    # Salvar chave pública em um arquivo
    with open(f"./keys/{key_name}_public_key.pem", "wb") as public_file:
        public_file.write(public_pem)


def sign_document(document_path, private_key_path, signature_path):
    # Ler o documento
    with open(document_path, "rb") as document_file:
        document = document_file.read()
    
    # Ler a chave privada
    with open(private_key_path, "rb") as key_file:
        private_key = serialization.load_pem_private_key(
            key_file.read(),
            password=None
        )
    
    # Assinar o documento
    signature = private_key.sign(
        document,
        padding.PSS(
            mgf=padding.MGF1(hashes.SHA256()),
            salt_length=padding.PSS.MAX_LENGTH
        ),
        hashes.SHA256()
    )
    
    # Salvar a assinatura em um arquivo
    with open(signature_path, "wb") as signature_file:
        signature_file.write(signature)


def validate_signature(document_path, signature_path, public_key_path):
    # Ler o documento
    with open(document_path, "rb") as document_file:
        document = document_file.read()
    
    # Ler a assinatura
    with open(signature_path, "rb") as signature_file:
        signature = signature_file.read()
    
    # Ler a chave pública
    with open(public_key_path, "rb") as key_file:
        public_key = serialization.load_pem_public_key(
            key_file.read()
        )
    
    # Validar a assinatura
    try:
        public_key.verify(
            signature,
            document,
            padding.PSS(
                mgf=padding.MGF1(hashes.SHA256()),
                salt_length=padding.PSS.MAX_LENGTH
            ),
            hashes.SHA256()
        )
        print("Assinatura válida. O documento é de autoria de A.")
    except InvalidSignature:
        print("Assinatura inválida. O documento não é de autoria de A.")



# Gerar pares de chaves A e B
generate_and_store_keys("key_A")
generate_and_store_keys("key_B")

# Assinar o documento testes com a chave de A e salvar a assinatura em document_signature
sign_document("./docs/testes.txt", "./keys/key_A_private_key.pem", "./signatures/testes_signature.bin")

validate_signature("./docs/testes.txt", "./signatures/testes_signature.bin", "./keys/key_B_public_key.pem")
validate_signature("./docs/testes.txt", "./signatures/testes_signature.bin", "./keys/key_A_public_key.pem")

# Após alterar o conteúdo do arquivos testes.txt, a assinatura não será mais válida
content = ""
with open("./docs/testes.txt", 'r') as doc:
    content = doc.read()

with open("./docs/testes.txt", 'w') as doc:
    doc.write(content + " alterado")

validate_signature("./docs/testes.txt", "./signatures/testes_signature.bin", "./keys/key_A_public_key.pem")