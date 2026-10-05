import java.util.Scanner; 
 
public class CareerSimulator { 
 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int choice; 
        char cont; 
 
        do { 
            System.out.println("\n===== CAREER SIMULATOR ====="); 
            System.out.println("Select your area of interest:"); 
            System.out.println("1. Mathematics & Logic"); 
            System.out.println("2. Computer & Technology"); 
            System.out.println("3. Biology & Medicine"); 
            System.out.println("4. Art & Creativity"); 
            System.out.println("5. Business & Management"); 
            System.out.print("Enter your choice (1-5): "); 
            choice = sc.nextInt(); 
 
            System.out.print("Rate your interest level in this field (1-10): "); 
            int rating = sc.nextInt(); 
 
            String career = suggestCareer(choice, rating); 
            System.out.println("\n--> Suggested Career Path: " + career); 
 
            System.out.print("\nDo you want to explore another field? (y/n): "); 
            cont = sc.next().charAt(0); 
 
        } while (cont == 'y' || cont == 'Y'); 
 
        System.out.println("\nThank you for using Career Simulator!"); 
        sc.close(); 
    } 
 
    // Method to decide career based on choice and interest rating 
    static String suggestCareer(int choice, int rating) { 
        String level; 
 
        if (rating >= 8) { 
            level = "High"; 
        } else if (rating >= 4) { 
            level = "Medium"; 
        } else { 
            level = "Low"; 
        } 
 
        String career; 
 
        switch (choice) { 
            case 1: 
                career = level.equals("High") ? "Data Scientist / Research Analyst" 
                        : level.equals("Medium") ? "Statistician / Accountant" 
                        : "General Math Tutor"; 
                break; 
            case 2: 
                career = level.equals("High") ? "Software Engineer / AI Developer" 
                        : level.equals("Medium") ? "IT Support Specialist" 
                        : "Computer Operator"; 
                break; 
            case 3: 
                career = level.equals("High") ? "Doctor / Medical Researcher" 
                        : level.equals("Medium") ? "Nurse / Lab Technician" 
                        : "Healthcare Assistant"; 
                break; 
            case 4: 
                career = level.equals("High") ? "Graphic Designer / Film Director" 
                        : level.equals("Medium") ? "Content Creator" 
                        : "Hobbyist Artist"; 
                break; 
            case 5: 
                career = level.equals("High") ? "Entrepreneur / Business Analyst" 
                        : level.equals("Medium") ? "Marketing Executive" 
                        : "Sales Associate"; 
                break; 
            default: 
                career = "Invalid choice. Please explore a valid category."; 
        } 
 
        return career + "  [Interest Level: " + level + "]";
    }
}