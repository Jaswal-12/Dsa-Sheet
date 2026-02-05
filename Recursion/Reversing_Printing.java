class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dc(n);
    }
    
    public static void dc(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        dc(n - 1);
    }
}
