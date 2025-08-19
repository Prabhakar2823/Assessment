package Assessment;

public class Bill {
    public static void main(String[] args) {
        float pencil = 10f;
        float pen = 20f;
        float eraser =5.5f;
        //total sum
        float sum = pencil+pen+eraser;
        //percentage result
        float percentage=18;
        float result=sum+(sum*percentage/100);
        float total=sum;
        //print result
        System.out.println("sum of items :" +sum);
        System.out.println("18% of gst :" + result);

    }
}
