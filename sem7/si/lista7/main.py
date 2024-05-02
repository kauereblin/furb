from Crypto.Cipher import Blowfish
from Crypto.Util.Padding import pad

# Nesta lista, iremos exercitar a utilização de um algoritmo de criptografia. 
# Utilizaremos o algoritmo “Blowfish”. Este algoritmo utiliza cifragem de bloco de 64 bits. Nestes exercícios, utilize o 
# esquema de preenchimento de bloco “PKCS#5” para todos os casos desta lista. Utilize também como chave a sequência de bytes [65, 66, 67, 68, 69].  
# Crie um programa para as questões abaixo. Submeta no AVA o programa que você construiu, bem como as respostas às perguntas das questões:

# Caso 1 
# Criptografe o texto “FURB” usando o modo de operação “ECB”. 
key = bytes([65, 66, 67, 68, 69])
cipher = Blowfish.new(key, Blowfish.MODE_ECB)

text = "FURB"
text_bytes = text.encode()

ciphertext = cipher.encrypt(pad(text_bytes, Blowfish.block_size))
print("Texto FURB cifrado em hexadecimal:", ciphertext, "\n")

#1.1. Qual o conteúdo do texto cifrado (em hexadecimal)? 
#R.: \x7fG\x00\xaao_\xe0\x8b

#1.2. Qual a extensão (quantidade de caracteres) do texto cifrado?
#R.: 16


# Caso 2 
# Criptografe “COMPUTADOR” e o modo de operação “ECB”. 
text = "COMPUTADOR"
text_bytes = text.encode()

ciphertext = cipher.encrypt(pad(text_bytes, Blowfish.block_size))
print("Texto COMPUTADOR cifrado em hexadecimal:", ciphertext, "\n")


# 2.1. Qual o conteúdo do texto cifrado (em hexadecimal)? 
# R.: \xf3G9\xabv4\xc4\xef\xe5\x0f\xf1\xb5T\x85er

# 2.2. Qual a extensão do texto cifrado? 
#R.: 32

# 2.3. Por que o texto cifrado tem tal tamanho?
# R.: O tamanho do texto ultrapassa o tamanho de um bloco, resultando na necessidade de mais de um bloco para cifrar o texto.

# Caso 3 
# Criptografe “SABONETE” e utilize o modo de operação “ECB”.
text = "SABONETE"
text_bytes = text.encode()

ciphertext = cipher.encrypt(pad(text_bytes, Blowfish.block_size))
print("Texto SABONETE cifrado em hexadecimal:", ciphertext, "\n")

# 3.1. Qual o conteúdo do texto cifrado (em hexadecimal)? 
# R.: \x84\x10\x91G&\x04\xb9j\xcd\xbc>/\xef\xa7;\xdd

# 3.2. Qual a extensão do texto cifrado? 
# R.: 32

# 3.3. Por que o texto cifrado tem tal tamanho? 
# R.: O tamanho do texto ultrapassa o tamanho de um bloco, resultando na necessidade de mais de um bloco para cifrar o texto.

# Caso 4
# Criptografe a sequência de bytes [8, 8, 8, 8, 8, 8, 8, 8] utilizando o modo de operação ECB.
key = bytes([8, 8, 8, 8, 8, 8, 8, 8])
cipher = Blowfish.new(key, Blowfish.MODE_ECB)

text = "FURB"
text_bytes = text.encode()

ciphertext = cipher.encrypt(pad(text_bytes, Blowfish.block_size))
print("Texto FURB com key [8, 8, 8, 8, 8, 8, 8, 8] cifrado:", ciphertext.hex(), "\n")
# 4.1. Qual o conteúdo do texto cifrado?
# R.: 4\xb70<\x06\xddI6

# 4.2. Compare os primeiros 8 bytes do texto cifrado com o último bloco cifrado da questão anterior. Que conclusão é possível obter?
# R.:Há um deslocamento de 8 bytes entre os textos cifrados, o que indica que a chave utilizada é diferente.

# Caso 5 
# Criptografe o texto “SABONETESABONETESABONETE” e utilize o modo de operação “ECB”.
text = "SABONETESABONETESABONETE"
text_bytes = text.encode()

ciphertext = cipher.encrypt(pad(text_bytes, Blowfish.block_size))
print("Texto SABONETESABONETESABONETE com key [8, 8, 8, 8, 8, 8, 8, 8] cifrado em hexadecimal:", ciphertext, "\n")

# 5.1. Qual o conteúdo do texto cifrado (em hexadecimal)?
# R.: \x15\xad\xddX\x04\x83\xcbD\x15\xad\xddX\x04\x83\xcbD\x15\xad\xddX\x04\x83\xcbD\xdf\xd60 \x11\xceZ\xff

# 5.2. Qual a extensão do texto cifrado?
# R.: 32

# 5.3. Avalie o conteúdo do texto cifrado. Que conclusão é possível obter a partir do texto cifrado e do texto simples?
# R.: Aumentando o texto e modificando a chave, a quantidade de blocos mantém a mesma, porém o conteúdo cifrado é diferente.

# Caso 6 
# Criptografe o texto “FURB” e agora utilize o modo de operação “CBC”.
cipher = Blowfish.new(key, Blowfish.MODE_CBC)

text = "FURB"
text_bytes = text.encode()

ciphertext = cipher.encrypt(pad(text_bytes, Blowfish.block_size))
print("Texto FURB com key [8, 8, 8, 8, 8, 8, 8, 8] cifrado com CBC em hexadecimal:", ciphertext, "\n")

# 6.1. Qual o conteúdo do texto cifrado (em hexadecimal)?
# R.: \n\x0c\x83g\x8e\xa28\xac

decriptedtext = cipher.decrypt(ciphertext)
print(decriptedtext)
# 6.2. Tente decifrar o texto cifrado, para recuperar o texto simples. O que acontece?
# R.: 


























