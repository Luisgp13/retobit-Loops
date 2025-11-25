public class Loops {
    /**
     * Reto 1: Suma de elementos con while
     * Usa un bucle while para recorrer el array "numbers" y sumar todos sus elementos.
     * No cambies los valores del array.
     * Crea una variable llamada "sum" donde acumules el resultado y devuélvela.
     * <p>
     * Resultado esperado: 24
     */
    public static int sumArrayWhile() {
        // Definimos un array de enteros
        int[] numbers = {4, 6, 9, 5};
        // Tu código aquí (usa while)
        // Variable para acumular la suma
        int sum = 0;
        // Índice para recorrer el array
        int i = 0;
        // Mientras i sea menor que la longitud del array
        while (i < numbers.length) {
            // Se acumula el valor en la suma
            sum += numbers[i];
            // Avanzamos al siguiente índice
            i++;
        }
        // consejo: declara la variable "sum" fuera del loop
        // Sustituye el 0 por la variable sum
        return sum;
    }

    /**
     * Reto 2: Contar números pares con DO WHILE
     * Usa el bucle do while para recorrer el array "numbers" y contar cuántos números son pares.
     * No cambies los valores del array. (no se puede hacer trampitas)
     * Crea una variable llamada "count" donde acumules el resultado.
     * <p>
     * Resultado esperado: 3
     */
    public static int countEvenNumbersDoWhile() {
        // Definimos un array de enteros
        int[] numbers = {4, 6, 9, 5, 8};
        // Tu código aquí (usa do while)
        // Variable para contar los pares
     int count = 0;
        // Índice para recorrer el array
     int i =0;

        // El do-while asegura que el bloque se ejecute al menos una vez
    do{
        // Verificamos si el número actual es par
        if(numbers[i] % 2 ==0){
            count++;
        }
        // Avanzamos al siguiente índice
        i++;

    }while(i<numbers.length);
        // Sustituye el 0 por la variable count
        return count;
    }

    /**
     * Reto 3: Recorrer un array con FOR BÁSICO
     * Usa un bucle for para recorrer el array "numbers" y devolver el número más grande.
     * No cambies los valores del array.
     * Crea una variable llamada "max" donde almacenes el resultado.
     * <p>
     * Resultado esperado: 9
     */
    public static int findMaxWithFor() {
        int[] numbers = {4, 6, 9, 5, 3, 2};
        // Tu código aquí (usa for)
        // consejo: declara la variable "max" fuera del loop
        int max = numbers[0];
        // Recorremos el array desde el segundo elemento
        for(int i=0; i<numbers.length; i++){
            // Si encontramos un número más grande que el actual 'mayor'
        if(numbers[i] > max){
            max=numbers[i];

        }
        }
        // Sustituye el 0 por la variable max
        return max;
    }

    public static void main(String[] args) {
        // Puedes probar tus métodos aquí si quieres.
        // Cuando le des a "Run" ejecutará el main y podrás ver los resultados.

        System.out.println("Reto 1: Suma de elementos con while");
        System.out.println("Resultado: " + sumArrayWhile());
        System.out.println("Reto 2: Contar números pares con DO WHILE");
        System.out.println("Resultado: " + countEvenNumbersDoWhile());
        System.out.println("Reto 3: Recorrer un array con FOR BÁSICO");
        System.out.println("Resultado: " + findMaxWithFor());
    }
}
