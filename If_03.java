class If_03 {
    public static void main(String[] args) {
        int age = 0;

        if(age >= 20){
            // >= 20 の条件を満たした時の処理
            System.out.println("adult");
        } else if (age == 0){
            // == 0 の条件を満たした時の処理
            System.out.println("baby");
        } else {
            // 条件を満たさない時の処理
            System.out.println("child");
        }
    }
}
