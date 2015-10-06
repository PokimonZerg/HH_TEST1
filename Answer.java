// Получается -6 из-за переполнения. 
// Просто следует поменять int на long и все проблемы решаться
// Ниже правильный код
public static void main(String[] args) {
    long a = 0x7ffffffc;
    long b = 0x7ffffffe;

    long c = a + b;
    System.out.println(c);
}