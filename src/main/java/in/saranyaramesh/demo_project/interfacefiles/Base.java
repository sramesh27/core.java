package in.saranyaramesh.demo_project.interfacefiles;
import java.util.Set;

public interface Base <T> {
	
	public abstract Set<T> findAll();
	public abstract void create(T object);
	public abstract void update(int id, T updatedObject);
	public abstract void delete();
	public abstract T findById(int id);
}