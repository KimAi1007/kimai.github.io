package Model;

public class product {
	private int id;
	private String image;
	private String name;
	private String price;
	private String category;
	private String description;
	private String quatity;
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product(int id, String image, String name, String price, String category, String description,
			String quatity) {
		super();
		this.id = id;
		this.image = image;
		this.name = name;
		this.price = price;
		this.category = category;
		this.description = description;
		this.quatity = quatity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuatity() {
		return quatity;
	}
	public void setQuatity(String quatity) {
		this.quatity = quatity;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", image=" + image + ", name=" + name + ", price=" + price + ", category="
				+ category + ", description=" + description + ", quatity=" + quatity + "]";
	}
	

}