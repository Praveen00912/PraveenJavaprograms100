class ThreeMatrix {
    int arr[]= {60,70,90,43,65,97};
    int max=0;
    int secondMax=0;
    for(int i=0; i<arr.length;i++){
        if(arr[i]>max){
            secondMax=max;
            max=arr[i];
        }
        else{
            if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
            System.out.println("Second maximum:"+secondMax);
        }
    }
}
