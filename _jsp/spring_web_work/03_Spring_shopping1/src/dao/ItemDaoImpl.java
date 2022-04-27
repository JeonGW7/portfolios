package dao;
import java.util.List;
import logic.ItemDTO;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper; //행 맵핑
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

//구현클래스
public class ItemDaoImpl implements ItemDao{
	private SimpleJdbcTemplate template; //변수
	public void setDataSource(DataSource dataSource){
		this.template=new SimpleJdbcTemplate(dataSource);
	}//setDataSource-end DB연결끝
	
	//변수
	private static final String SELECT_ALL="select item_id,item_name,price,descripton,picture_url from item";
	
	@Override
	public List<ItemDTO> findAll() {
		RowMapper<ItemDTO> rmapper=new BeanPropertyRowMapper<ItemDTO>(ItemDTO.class);
		return this.template.query(ItemDaoImpl.SELECT_ALL, rmapper);
	}
	
}//class-end
