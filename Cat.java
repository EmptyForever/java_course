// public class Cat {

//     public String name;
//     public String poroda = "";
//     public Integer age = 1;

//     public void info() {
//         System.out.println(this.name + " " + this.poroda + " " + this.age);
//     }

//     public Cat(String name, String poroda, Integer age) {
//         this.age = age;
//         this.name = name;
//         this.poroda = poroda;
//     }

//     public Cat(String name, Integer age) {
//         this.age = age;
//         this.name = name;
//     }

//     public Integer getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getPoroda() {
//         return poroda;
//     }

//     public void setAge(Integer age) {
//         this.age = age;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setPoroda(String poroda) {
//         this.poroda = poroda;
//     }

//     @Override
//     public String toString() {
//         return this.name + " <-- Имя  возраст -> " + this.age;
//     }

// }

public class Cat {
    // public     - РІРёРґРµРЅ РІРµР·РґРµ
    // private    - РІРёРґРµРЅ С‚РѕР»СЊРєРѕ РІ СЌС‚РѕРј РєР»Р°СЃСЃРµ
    // protected  - РІРёРґРµРЅ РІ СЌС‚РѕРј РєР»Р°СЃСЃРµ Рё РІ РєР»Р°СЃСЃР°С…-РЅР°СЃР»РµРґРЅРёРєР°С…
    public static void main(String[] args) {
        
    }
    private String name;
    private String poroda = "dom";
    private Integer age = 1;

    public Cat(String name, String poroda, Integer age){
        this.age = age;
        this.name = name;
        this.poroda = poroda;
    }

    public Cat(String name, Integer age){
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }




    
    public void info(){
        System.out.println(this.name + " " + this.poroda + " " + this.age);
    }

    @Override
    public String toString(){
        return this.name + " <-РРјСЏ Р’РѕР·СЂР°СЃС‚-> " + this.age;
    }
}