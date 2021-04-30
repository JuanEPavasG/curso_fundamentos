public class Sensor{
    public static int[] sensores = new int[8];
    public static int tamano =8;
    public int posAnadir=0;
    private String tipo;
    private double valor;
    public Sensor(){
        
    }
    public Sensor(String t, double v){
        this.tipo=t;
        this.valor=v;
    }
    public String getTipo(){
        return this.tipo;
    }
    public double getValor(){
        return this.valor;
    }
    public void setTipo(String s){
        this.tipo=s;
    }
    public void setVlor(double v){
        this.valor=v;
    }
    public String toString(){
        return "tipo : "+this.tipo+" ,valor: "+this.valor;
    }
    public static String toStringSensores(){
        return "";
    }
    /*public static int cantidadSensores(){
        for(int i=0;i<8;i++){
            if(posAnadir!=0){
                conteo+=1;
            }
        }
        return conteo;
    }*/
    
}