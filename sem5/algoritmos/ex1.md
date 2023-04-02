1. Seja 𝑓(𝑛) = (𝑛 + 1)^2. Determine 𝑂(𝑔(𝑛)), 𝑑𝑒𝑡𝑒𝑟𝑚𝑖𝑛𝑎𝑛𝑑𝑜 𝑛0 𝑒 𝑎 𝑐𝑜𝑛𝑠𝑡𝑎𝑛𝑡𝑒
C >= 1
n0 = 0
<br>

2. Seja f(n) = n e 𝑔(𝑛) = 𝑛^2. Mostre que g(n) não é 𝑂(𝑛).
Pois n^2 destoa muito da funcão de n
<br>

3. 7n − 2 é O(n)?
C >= 7
n0 = 2
Sim, tendo constante e n0 possíveis
<br>

4. 3𝑛^3 + 20𝑛^2 + 5 é 𝑂(𝑛3)
C >= 3
n0 = -
<br>

5. 2𝑛^2 + 100𝑛log(𝑛) é 𝑂(𝑛^2)?
Não pois o termo de maior significância é 𝑛log(𝑛)
<br>

6. Seja 𝑓(𝑛) = (𝑛 + 1)^2. Determine Ω(𝑔(𝑛)), 𝑑𝑒𝑡𝑒𝑟𝑚𝑖𝑛𝑎𝑛𝑑𝑜 𝑛0 𝑒 𝑎 c𝑜𝑛𝑠𝑡𝑎𝑛𝑡𝑒.
C <= 1
n0 = -1
<br>

7. Seja f(n) = log(n) (crescente) e 𝑔(𝑛) = 𝑛. Mostre que g(n) não é Ω(𝑛).
O(g(n)) - C <= 1 n = 0
Ω(f(n)) - C >= log(n) n = 0
g(n) sempre é maior que f(n)
<br>

8. 7n − 2 é Ω(n)?
C <= 7
n0 = 2
<br>

9. 3𝑛^3 + 20𝑛^2 + 5 é Ω(𝑛^3)?
C <= 3
n0 = -
<br>

10. 2𝑛^2 + 100𝑛log(𝑛) é Ω(𝑛^2)?
Sim, pelo termo 100nlog(n) ser maior que n^2
<br>

11. Prove que 4𝑙𝑜𝑔2(𝑛) + 16 = 𝑂(𝑛).
4log2(n) + 16 = 0
log2(n) = -4
n = 2^(-4)
n = 1/16
Ou seja, para n >= 1/16, 4log2(n) + 16 = 𝑂(𝑛)
<br>

12. Prove que 4𝑙𝑜𝑔2(𝑛) + 16 = 𝑂(𝑙𝑜𝑔2(𝑛)).
O termo de maior significa é log2(n), ou seja, tendo C >= 4 assim 4log2(n) + 16 = 𝑂(𝑙𝑜𝑔2(𝑛))
<br>

13. 2^(𝑛+1) = 𝑂(2^𝑛). 𝑉𝑒𝑟𝑑𝑎𝑑𝑒𝑖𝑟𝑜 𝑜𝑢 𝐹𝑎𝑙𝑠𝑜? 𝐽𝑢𝑠𝑡𝑖𝑓𝑖𝑞𝑢𝑒 𝑠𝑢𝑎 𝑟𝑒𝑠𝑝𝑜𝑠𝑡𝑎.
Falso, pois expoente é mais significativo que a multiplicação por uma constante
<br>

14. 2^2𝑛 = 𝑂(2^𝑛). 𝑉𝑒𝑟𝑑𝑎𝑑𝑒𝑖𝑟𝑜 𝑜𝑢 𝐹𝑎𝑙𝑠𝑜? 𝐽𝑢𝑠𝑡𝑖𝑓𝑖𝑞𝑢𝑒 𝑠𝑢𝑎 𝑟𝑒𝑠𝑝𝑜𝑠𝑡𝑎.
Falso, a multiplicação do expoente faz com que a constante tenha que depender de n
<br>

15. Considerando as questões 1 a 10 qual delas podemos chamar de ʘ(g(n)).
1, 3, 4
<br>

16. Em relação ao limite assintótico de notação O, atribua V (verdadeiro) ou F (falso) às afirmativas a seguir.
(V) Em uma estrutura de laço duplamente aninhado, tem-se imediatamente um limite superior O(n²).
(V) Em uma estrutura de laço duplamente aninhado, o custo de cada iteração do laço interno é de limite superior O(1).
(F) Em uma estrutura de laço triplamente aninhado, o custo de cada iteração do laço interno é de limite superior O(n³).
(V) O limite O(n²) para o tempo de execução do pior caso de execução aplica-se para qualquer entrada.
(F) f(n) = O(g(n)) é uma afirmação de que algum múltiplo constante de g(n) é de limite assintótico inferior.
Assinale a alternativa que contém, de cima para baixo, a sequência correta.
**a) V, V, F, V, F.**
b) V, F, V, F, V.
c) F, V, V, F, F.
d) F, F, V, V, F.
e) F, F, F, V, V.
<br>

17. Abaixo citamos alguns tipos de problemas/algoritmos, pesquise qual seria sua notação assintótica O.

a) Método Simplex (no pior caso)
O(2^n)

b) Algoritmos de Busca
O(n)

c) Matrizes
O(n^2)

d) Algoritmos de Ordenação.
O(n^2)

e) Algoritmos que solucionam problemas do caixeiro viajante.
O(n!)

f) Algoritmo **Quick Sort**.
O(log(n))

g) Algoritmo **Tree Sort**.
O(nlog(n))

h) Algoritmo **Shell sort**.
O(n(log(n))^2)

<br>

18. Para as funções abaixo determine: 𝑶, 𝜽, 𝛀, 𝒐 𝒆 𝝎 𝒔𝒆 𝒑𝒐𝒔𝒔í𝒗𝒆𝒍.

𝑎) 𝑓(𝑛) = 10𝑛^3 + 5𝑛 + 𝑛^2
𝑶(n^3)
𝜽(n^3)
𝛀(n^3)
𝒐(n^4)
𝝎(n^2)

𝑏) 𝑓(𝑛) = 𝑛log𝑛 + log𝑛
𝑶(𝑛log𝑛)
𝜽(𝑛log𝑛)
𝛀(𝑛log𝑛)
𝒐(𝑛log𝑛)
𝝎(𝑛log𝑛)

𝑐) 𝑓(𝑛) = 3^𝑥 + 𝑛^3 + 𝑛
𝑶(n^3)
𝜽(n^3)
𝛀(n^3)
𝒐(n^4)
𝝎(n^2)

𝑑) 𝑓(𝑛) = 2𝑛 + 2500
𝑶(n)
𝜽(n)
𝛀(n)
𝒐(n^2)
𝝎(n)
