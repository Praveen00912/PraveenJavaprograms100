import java.util.Scanner;
class StudentsGradingSystem{
static Scanner sc=new Scanner(System.in);

int [] marksArray = new int[3];
markArray[0]=30;
markArray[1]=40;
markArray[2]=50;

SOP(markArray[0]);


// classic for loop
for (int i=0;i<marksArray.length;i++){
SOP(marksArray[i];
}


//enchanced for loop

for(int marks: marksArray){
SOP(marks);
}

//String[] fruitArray = new String[4];

String[] fruitArray = {"Apple","Banana","Orange"};
SOP(fruitArray.length);
for(String fruit: fruitArray){
Sop(fruit);
}