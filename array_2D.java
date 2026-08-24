class array_2D{
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        a[0][0]=2;
        a[0][1]=5;
        a[0][2]=8;
        a[1][0]=3;
        a[1][1]=6;
        a[1][2]=9;
        a[2][0]=4;
        a[2][1]=7;
        a[2][2]=10;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
        System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
    }
}