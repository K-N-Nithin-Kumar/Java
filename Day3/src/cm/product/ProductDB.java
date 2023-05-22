package cm.product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ProductDB {
	Connection conn=null;
	public ProductDB()
	{
		try {
			Class.forName("org.postgresql.Driver");
			conn=DriverManager.getConnection("jdbc:postgresql://localhost:5434/productdb","postgres","root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void save(Product p) {
		String query="insert into product(name,type,place,warranty) values(?,?,?,?)";
		try {
			PreparedStatement st =conn.prepareStatement(query);
			st.setString(1, p.getName());
			st.setString(2, p.getType());
			st.setString(3, p.getPlace());
			st.setInt(4, p.getWarranty());
			st.execute();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public List<Product> getAll() {
		List<Product> prod = new ArrayList<Product>();
		String query="select * from product";
		try {
			Statement st = conn.createStatement();
	         ResultSet rs = st.executeQuery(query);
	         while(rs.next()){
	        	 Product p=new Product();
	        	 p.setName(rs.getString(1));
	        	 p.setType(rs.getString(2));
	        	 p.setPlace(rs.getString(3));
	        	 p.setWarranty(rs.getInt(4));
	        	 prod.add(p);
	         }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return prod;
	}
}
 