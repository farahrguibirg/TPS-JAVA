package TP4;

class Conversion {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Formats acceptés: \"12\", \"12.0\", \"12,0\"");
        System.out.print("\nEntrez un nombre: ");
        String input = sc.nextLine();
        
        try {
            String cleaned = input.trim()
                                  .replace(",", ".")  
                                  .replaceAll("\\.0+$", ""); 
            
            int nombre = Integer.parseInt(cleaned);
            
            System.out.println("\n✓ Conversion réussie!");
            System.out.println("→ Entrée: \"" + input + "\"");
            System.out.println("→ Nettoyée: \"" + cleaned + "\"");
            System.out.println("→ Résultat (int): " + nombre);
            
        } catch (NumberFormatException e) {
            System.err.println("\n❌ Erreur: Format invalide pour '" + input + "'");
            System.out.println("→ Impossible de convertir en nombre entier");
            System.out.println("→ Exemples valides: 12, 12.0, 12,0, 12.00");
        }
        
        sc.close();
    }
}
