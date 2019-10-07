package Test0928;

public class Person {
    private String idCard;
    private String name;
    private String sex;
    private double height;  //以厘米为准
    private double weight; //以kg为准

    //人的特性
    public  void eat(){
        System.out.println(name+"在吃饭");
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    //人的构造方法
    public Person(String idCard,String name,String sex,int height,float weight){
        this.setIdCard(idCard);
        this.setName(name);
        this.setSex(sex);
        this.setHeight(height);
        this.setWeight(weight);
    }
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        String str=checkInCard(idCard);
        if(str.equals("")){
            this.idCard=idCard;
        }
        else{
            System.out.println(str);
        }
    }

    private String checkInCard(String idCard) {
        String result="";
        if(idCard.length()!=18){
            result="身份证的长度不是18位";
        }
        else{
            char ch=idCard.charAt(17);
            if(ch!='x'&&ch<'0'||ch>'9'){
                result="身份证号的最后一位不合法";
            }
            else{
                for(int i=0;i<idCard.length()-1;i++){
                    char ch1=idCard.charAt(i);
                    if(ch1<'0'||ch1>'9'){
                        result="身份证号的前17位有非法的字符";
                        break;
                    }
                }
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name=name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if((sex.equals("男"))||(sex.equals("女"))){
            this.sex = sex;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0&&height<250){
            this.height = height;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
