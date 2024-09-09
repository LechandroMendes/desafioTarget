public class CountA {
    public static int countA(String str) {
        // Converte a string para minúsculas e conta as ocorrências de 'a'
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        int count = countA(input);
        System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        scanner.close();
    }
}