 class program3 {
    public static void main(String[] args) {
        int i,num;
        System.out.println("Five Random Integers are : ");
        for(i=0;i<5;i++)
        {
            num=(int)(Math.random()*100);
            System.out.println(num);
        }
    }
    
}
