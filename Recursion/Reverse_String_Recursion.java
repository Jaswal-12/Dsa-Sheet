class Main {

    public static String reversestr(char[] arr, int s, int e) {

        // Base case
        if (s >= e) {
            return new String(arr);
        }

        // swap
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        return reversestr(arr, s + 1, e - 1);
    }

    public static void main(String[] args) {

        String str = "karan";
        int s = 0;
        int e = str.length() - 1;

        System.out.println(reversestr(str.toCharArray(), s, e));
    }
}
