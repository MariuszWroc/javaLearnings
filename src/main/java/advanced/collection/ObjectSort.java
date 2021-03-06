package advanced.collection;

public class ObjectSort implements Comparable<ObjectSort>{
	private Integer id;
	private String description;
	
	
	
	public ObjectSort(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int compareTo(ObjectSort o) {
		return id - o.getId();
	}

}
