package in.saranyaramesh.demo_project.DAO;
import in.saranyaramesh.demo_project.interfacefiles.*;
import in.saranyaramesh.demo_project.model.User;
import in.saranyaramesh.demo_project.model.UserEntity;
import in.saranyaramesh.demo_project.util.ConnectionUtil;
import java.sql.*;
import java.util.*;

public class UserDAO implements UserInterface{
	
	public Set<User> findAll() throws RuntimeException {	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Set<User> userList = new HashSet<>();
		
		try {
			
			String query = "SELECT * FROM users WHERE isActive=1";
			con = ConnectionUtil.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("firstname"));
				user.setLastname(rs.getString("lastname"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setActive(rs.getBoolean("isActive"));
				userList.add(user);
			}
		}catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		}finally {
			ConnectionUtil.close(con, ps, rs);
		}
		
		return userList;
		
//		UserEntity[] userList = UserList.listOfUsers;
//		return userList;
	}

	@Override
	public void create(User newuser) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			String query = "INSERT INTO users (first_name,last_name,email,password)values(?,?,?,?)";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			
			ps.setString(1, newuser.getFirstname());
			ps.setString(2, newuser.getLastname());
			ps.setString(3, newuser.getEmail());
			ps.setString(4, newuser.getPassword());
			
			ps.executeUpdate();
			
			System.out.println("User created Successfully");
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
		finally {
			ConnectionUtil.close(conn, ps);
		}
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		User user = null;
		ResultSet rs = null;
		
		try {
			String query = "SELECT * FROM users WHERE is_active = 1 AND id = ?";
			conn = ConnectionUtil.getConnection();
			ps = conn.prepareStatement(query);
			 
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setFirstname(rs.getString("first_name"));
				user.setLastname(rs.getString("Last_name"));
				user.setEmail(rs.getString("email"));
				user.setActive(rs.getBoolean("is_active"));
				user.setPassword(rs.getString("password"));
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
		finally {
			ConnectionUtil.close(conn, ps);
		}
		
		return user;
	}
	@Override
	public void update(int id, User updateUser) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			String query = "UPDATE users SET first_name = ?, last_name = ? WHERE is_active = 1 AND id = ?";
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(query);
			

			
			ps.setString(1, updateUser.getFirstname());
			ps.setString(2,  updateUser.getLastname());
			ps.setInt(3, id);
			ps.executeUpdate();
			
			System.out.println("User has been updated successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new RuntimeException();
			
		} finally {
			ConnectionUtil.close(connection, ps);
		}
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User findByEmail(String ermail) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int countOfActiveUsers() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	/**
	 *
	 * @param id
	 * @param updateUser
	 */
	
//	public void update(int id, UserEntity updateUser) {
//		
//		UserEntity[] userList = UserList.listOfUsers;
//		
//		for(int i=0; i<userList.length; i++) {
//			
//			UserEntity user = userList[i];
//			
//			if(user==null) {
//				continue;
//			}
//			
//			if(user.getId()==id) {
////				user.setFirstName("Thara");
//				
//				user.setFirstName(updateUser.getFirstName());
//				user.setLastName(updateUser.getLastName());
//				user.setPassword(updateUser.getPassword());
//				
//				break;
//			}
//			
//		}
//		
//	}
//	
//	public void delete(int id) {
//			
//			UserEntity[] userList = UserList.listOfUsers;
//			
//			for(int i=0; i<userList.length; i++) {
//				
//				UserEntity user = userList[i];
//				
//				if(user==null) {
//					continue;
//				}
//				
//				if(user.getId()==id) {
//					user.setActive(false);
//					break;
//				}
//			}
//		}
//
//	public UserEntity findById(int id) {
//		UserEntity[] userList = UserList.listOfUsers;
//		UserEntity userMatch = null;
//	
//		for (int i = 0; i < userList.length; i++) {
//			UserEntity user = userList[i];
//			if (user.getId() == id) {
//				userMatch = user;
//				break;
//			}
//		}
//		return userMatch;
//	}
//	
}