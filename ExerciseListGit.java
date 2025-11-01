package Exercises;

public class ExerciseListGit {
    public static void main(String[] args) {

//        1Escreva um programa para ler 2 valores (considere que não serão
//                informados valores iguais) e escrever o maior deles.
//        double valor1 = 0;
//        double valor2 = 47;
//        double valor3 = 42;
//        double valor4 = 49;
//
//        if (valor1 > valor2 && valor1 > valor3 && valor1 > valor4) {
//            System.out.println(valor1);
//        } else if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
//            System.out.println(valor2);
//        } else if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
//            System.out.println(valor3);
//        } else if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
//            System.out.println(valor4);
//        } else;
//    }

//        2Escreva um programa para ler o ano de nascimento de uma pessoa e
//        escrever uma mensagem que diga se ela poderá ou não votar este ano
//                (não é necessário considerar o mês em que ela nasceu).
//        double yearBirthday = 2010;
//        double age;
//        age = 2025-yearBirthday;
//        if (age > 18) {
//            System.out.println("Voce tem " + age + " E pode votar este ano");
//        } else {
//            System.out.println("Voce tem " + age + " E NÃO pode votar este ano");
//        }


//        3Escreva um programa que verifique a validade de uma senha fornecida
//        pelo usuário. A senha válida é o número 1234. Devem ser impressas as
//        seguintes mensagens:
//        ACESSO PERMITIDO caso a senha seja válida.
//                ACESSO NEGADO caso a senha seja inválida.
//        double password = 1243;
//        if (password == 1234){
//            System.out.println("ACESSO PERMITIDO");
//
//        }else {
//            System.out.println("ACESSO NEGADO");
//        }


//       4 As maçãs custam R$ 0,30 cada se forem compradas menos do que uma
//        dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um
//        programa que leia o número de maçãs compradas, calcule e escreva o
//        valor total da compra.
//        double appleQuant = 9;
//
//        if (appleQuant < 12) {
//            System.out.println(appleQuant + " Apples will cost you " + appleQuant *  0.30+ " dollars");
//        } else if (appleQuant > 12) {
//            System.out.println(appleQuant + " Apples will cost you " + appleQuant * 0.25+ " dollars");
//        }


//        5Escreva um programa para ler 3 valores inteiros (considere que não
//        serão lidos valores iguais) e escrevê-los em ordem crescente.
//        double value1 = 1;
//        double value2 = 123;
//        double value3 = 1;
//        if (value1 > value2 && value1 > value3 && value2 > value3) {
//            System.out.println(value1);
//            System.out.println(value2);
//            System.out.println(value3);
//        } else if (value1 > value2 && value1 > value3 && value3 > value2) {
//            System.out.println(value1);
//            System.out.println(value3);
//            System.out.println(value2);
//
//        } else if (value2 > value1 && value2 > value3 && value1 > value3) {
//            System.out.println(value2);
//            System.out.println(value1);
//            System.out.println(value3);
//
//        } else if (value2 > value1 && value2 > value3 && value3 > value1) {
//            System.out.println(value2);
//            System.out.println(value3);
//            System.out.println(value1);
//
//        } else if (value3 > value1 && value3 > value2 && value1 > value2) {
//            System.out.println(value3);
//            System.out.println(value1);
//            System.out.println(value2);
//
//        } else if (value3 > value1 && value3 > value2 && value2 > value1) {
//            System.out.println(value3);
//            System.out.println(value2);
//            System.out.println(value1);
//        } else if (value1 == value2 || value1 == value3 || value2 == value3) {
//            System.out.println("voce colocou valores iguais, melhore!");
//
//        }

//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//
//        System.out.print("Digite um número: ");
//        int numero = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        System.out.println("\nTabuada do " + numero + ":");
//
//        // loop de 1 a 10
//        for (int i = 1; i <= 10; i++) {
//            int resultado = numero * i;
//            System.out.println(numero + " x " + i + " = " + resultado);
//        }
//
//        scanner.close(); // boa prática: fechar o scanner


//       Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//
//        System.out.print("Digite um número de 1 a 10: ");
//        int numero = scanner.nextInt(); // lê o número digitado pelo usuário
//        double resultado = numero*10;
//        if (numero <=10) {
//            System.out.println(numero + " vezes 10" + " = " + resultado);
//        }else {
//            System.out.println("Digite um número menor ou igual a 10");
//        }
//        scanner.close(); // boa prática: fechar o scanner


//        6Tendo como entrada a altura e o sexo (codificado da seguinte forma:
//        1:feminino 2:masculino) de uma pessoa, construa um programa que
//        calcule e imprima seu peso ideal, utilizando as seguintes
//        Fórmulas:
//        - para homens: (72.7 * Altura) – 58
//                - para mulheres: (62.1 * Altura) – 44.7
//        double altura = 1.83;
//        String genero = "feminino";
//
//
//        double resultadoMasculino = (72.7 * altura) - 58;
//        double resultadoFeminino = (62.1 * altura) - 44.7;
//        if (genero == "masculino"){
//            System.out.println(resultadoMasculino);
//
//        } else if (genero == "feminino") {
//            System.out.println(resultadoFeminino);
//
//        }


//       7 Escreva um programa para ler o número de lados de um polígono regular
//        e a medida do lado (em cm). Calcular e imprimir o seguinte:
//− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da
//        área
//− Se o número de lados for igual a 4 escrever QUADRADO e o valor da
//        sua área.
//− Se o número de lados for igual a 5 escrever PENTÁGONO.


//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//        System.out.print("Digite o número de lados (3 a 5): ");
//        int numerodelados = scanner.nextInt(); // lê o número digitado pelo usuário
//        if (numerodelados<3 || numerodelados>5){
//            System.out.println("Por favor selecine um número entre 3 a 5");
//        return;
//        }
//
//
//        System.out.print("Digite a medida do lado: ");
//        int medidadelados = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        double calculoTriangulo = (medidadelados * medidadelados * Math.sqrt(3)) / 4;
//        double calculoQuadrado = medidadelados * medidadelados;
//        double calculoPentagono = (1.0/4)*(Math.sqrt(5*(5+2*(Math.sqrt(5)))))*medidadelados*medidadelados;
//
//          if (numerodelados == 3) {
//            System.out.println("É um triangulo e sua área é de: " + calculoTriangulo + "cm²");
//        } else if (numerodelados == 4) {
//            System.out.println("É um quadrado e sua área é de: " + calculoQuadrado + "cm²");
//        } else if (numerodelados == 5) {
//            System.out.println("É um pentagono e sua área é de: " + calculoPentagono + "cm²");
//        }
//
//
//        scanner.close(); // boa prática: fechar o scanner
//


//
//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//        int numerodelados;
//        do {
//            System.out.print("Digite o número de lados (3 a 5): ");
//            numerodelados = scanner.nextInt(); // lê o número digitado pelo usuário
//
//            if (numerodelados < 3 || numerodelados > 5) {
//                System.out.println("Por favor, selecione um número entre 3 e 5.");
//            }
//        } while (numerodelados < 3 || numerodelados > 5);
//
//        System.out.print("Digite a medida do lado: ");
//        int medidadelados = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        double calculoTriangulo = (medidadelados * medidadelados * Math.sqrt(3)) / 4;
//        double calculoQuadrado = medidadelados * medidadelados;
//        double calculoPentagono = (1.0 / 4) * (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5))))) * medidadelados * medidadelados;
//
//        if (numerodelados == 3) {
//            System.out.println("É um triângulo e sua área é de: " + calculoTriangulo + " cm²");
//        } else if (numerodelados == 4) {
//            System.out.println("É um quadrado e sua área é de: " + calculoQuadrado + " cm²");
//        } else if (numerodelados == 5) {
//            System.out.println("É um pentágono e sua área é de: " + calculoPentagono + " cm²");
//        }
//
//        scanner.close(); // boa prática: fechar o scanner


//        Acrescente as seguintes mensagens à solução do exercício anterior
//        conforme o caso.
//− Caso o número de lados seja inferior a 3 escrever NÃO É UM
//        POLÍGONO.
//− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO
//        IDENTIFICADO.
//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//        System.out.print("Digite o número de lados (3 a 5): ");
//        int numerodelados = scanner.nextInt();
//        System.out.print("Digite a medida do lado: ");
//        int medidadelados = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        double calculoTriangulo = (medidadelados * medidadelados * Math.sqrt(3)) / 4;
//        double calculoQuadrado = medidadelados * medidadelados;
//
//
//        if (numerodelados == 3) {
//            System.out.println("É um triângulo e sua área é de: " + calculoTriangulo + " cm²");
//        } else if (numerodelados == 4) {
//            System.out.println("É um quadrado e sua área é de: " + calculoQuadrado + " cm²");
//        } else if (numerodelados == 5) {
//            System.out.println("É um pentágono");
//        }else if (numerodelados < 3){
//            System.out.println("NÃO É UM POLÍGOLO");
//        }else if (numerodelados > 5){
//            System.out.println( "POLÍGOLO NÃO IDENTIFICADO");
//        }
//
//        scanner.close(); // boa prática: fechar o scanner


//        Escreva um programa para ler 3 valores inteiros e escrever o maior deles.
//                Considere que o usuário não informará valores iguais.
//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//        System.out.print("Write a number: ");
//        int value1 = scanner.nextInt();
//        System.out.print("Write another number: ");
//        int value2 = scanner.nextInt(); // lê o número digitado pelo usuário
//        System.out.print("Write another numer again: ");
//        int value3 = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        if (value1 > value2 && value1 > value3){
//            System.out.println("The biggest number is "+value1);
//        } else if (value2 > value1 && value2 > value3) {
//            System.out.println("The biggest number is "+value2);
//        }else if (value3 > value1 && value3 > value1) {
//            System.out.println("The biggest number is " + value3);
//        }return;


//        Escreva um programa que leia as medidas dos lados de um triângulo e
//        escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
//− Triângulo Equilátero: possui os 3 lados iguais.
//− Triângulo Isóscele: possui 2 lados iguais.
//− Triângulo Escaleno: possui 3 lados diferentes.
//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//        System.out.print("Write the first triangule side: ");
//        int triangule1 = scanner.nextInt();
//        System.out.print("Write the second triangule side: ");
//        int triangule2 = scanner.nextInt(); // lê o número digitado pelo usuário
//        System.out.print("Write the third triangule side: ");
//        int triangule3 = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        if (triangule1 == triangule2 && triangule1 == triangule3){
//            System.out.println("It is a equilateral triangule");
//        } else if (triangule1 == triangule2 || triangule1 == triangule3 || triangule2 == triangule3) {
//            System.out.println("It is a isoscele triangule");
//        }else if (triangule1 != triangule2 && triangule1 != triangule3 && triangule2 != triangule3) {
//            System.out.println("It is a scalene triangule");
//        } return;


//        Escreva um programa que leia o valor de 3 ângulos de um triângulo e
//        escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo
//        que:
//− Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
//− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
//− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
//        Scanner scanner = new Scanner(System.in); // cria o objeto para ler entrada
//        System.out.print("Write the first triangule angle: ");
//        int trianguleangle1 = scanner.nextInt();
//        System.out.print("Write the second triangule angle: ");
//        int trianguleangle2 = scanner.nextInt(); // lê o número digitado pelo usuário
//        System.out.print("Write the third triangule angle: ");
//        int trianguleangle3 = scanner.nextInt(); // lê o número digitado pelo usuário
//
//        if (trianguleangle1 + trianguleangle2 + trianguleangle3 != 180) {
//            System.out.println("This is NOT a triangle");
//        }
//         else if (trianguleangle1 == 90 || trianguleangle2 == 90 || trianguleangle3 == 90) {
//            System.out.println("This is a rectangle triangle");
//        }
//         else if (trianguleangle1 > 90 || trianguleangle2 > 90 || trianguleangle3 > 90) {
//            System.out.println("This is a obtuse triangle");
//        }
//         else if (trianguleangle1 < 90 && trianguleangle2 < 90 && trianguleangle3 < 90) {
//            System.out.println("This is a Acutaneous triangle");
//        }


    }


}





