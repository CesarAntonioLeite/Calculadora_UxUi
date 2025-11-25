package calculadora;

/**
 * <p><strong>Arquivo para teste rapído das operações</strong></p>
 * 
 * <p>Esta classe fornece o ambiente para que possam ser realizados os testes das operações predefinidas,
 * para verificação de seu funcionamento.
 * 
 * @author Cesar
 * @version 1.0
 * 
 */
public class TesteCalculadora {
    
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        
        /**
         * testando a operação somar
         * 
         * @param a primeiro operando com o valor de 2
         * @param b segundo operando com o valor de 3
         * @param operador "+"
         * @return 5
         */

        System.out.println(calc.calcular(2, 3, "+"));

        /**
         * testando a operação de subtrair
         * 
         * @param a primeiro operando com o valor de 10
         * @param b segundo operando com o valor de 4
         * @param operador "-"
         * @return 6
         */

        System.out.println(calc.calcular(10, 4, "-"));

        /**
         * testando a operação de multiplicar
         * 
         * @param a primeiro operando com o valor de 3
         * @param b segundo operando com o valor de 5
         * @param operador "*"
         * @return 15
         */

        System.out.println(calc.calcular(3, 5, "*"));

        /**
         * testando a operação de dividir
         * 
         * @param a primeiro operando com o valor de 8
         * @param b segundo operando com o valor de 2
         * @param operador "/"
         * @return 4
         */


        System.out.println(calc.calcular(8, 2, "/"));
        
        /**
         * testando a operação de multiplicar com zero
         * 
         * @param a primeiro operando com o valor de 8
         * @param b segundo operando com o valor de 0
         * @param operador "/"
         * @return "Divisão por zero não é permitida"
         */

        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /**
         * testando a operação de multiplicar com zero
         * 
         * @param a primeiro operando com o valor de 5
         * @param b segundo operando com o valor de 5
         * @param operador "X"
         * @return "Operador invalido: " + operador
         */

        try {
            System.out.println(calc.calcular(5, 5, "X"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
