# SpringData

Java Brains Spring Data

JDBC Template is used.
It needs DataSource object to be initialised.
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);;
	}
DataSource object has all connection details required to connect to MySql DB.
These information are stored in spring.xml

Table circle had 2 rows
id	name
1	a
2	b

Output:
count = 2
a
2
b
count = 3

Consider the following code from JdbcDaoImpl class.
	public List<Circle> getAllCircle() {
		String sql = "SELECT * FROM circle";
		return jdbcTemplate.query(sql, new CircleMapper());
	}
	
	private static final class CircleMapper implements RowMapper<Circle> {

		@Override
		public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(rs.getInt("id"));
			circle.setName(rs.getString("name"));
			return circle;
		}
		
	}

When jdbcTemplate gets the result from DB, it calls the RowMapper class associated with it.
For each of the row it gets from the DB, it calls the mapRow() method.