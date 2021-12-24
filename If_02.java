class If_02 {
    public static void main(String[] args) {
        //if ~ else文は条件を満たさない時の処理を記述・実行することができる。
        int age = 18;

        if (age >= 20){
            // 条件を満たした時の処理
            System.out.println("adult");
        } else {
            // 条件を満たさない時の処理
            System.out.println("child");
        }
    }
}
