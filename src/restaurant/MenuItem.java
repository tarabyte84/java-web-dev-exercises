package restaurant;



public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Boolean is_new;


    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
//        this.is_new = is_new;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIs_new(Boolean is_new) {
        this.is_new = is_new;
    }

//    public String toString() {
//        return this.name + " Price: " + this.price + " " + this.description + " Category: " + this.category;
//    }

//    public String getIs_new() {
//        String x = "";
//        if (is_new) {
//            x = this.name + "is a new menu item!";
//        }
//        return x;
//    }

//    @Override
//    public String toString() {
//        return "MenuItem{" +
//                "name='" + this.name + '\'' +
//                ", price=" + this.price +
//                ", description='" + this.description + '\'' +
//                ", category='" + this.category + '\'' +
//                '}';
//    }

    public String toString() {
        return this.name + " (" + this.category + "):" + this.description + " " + "$" + this.price;
    }




}
