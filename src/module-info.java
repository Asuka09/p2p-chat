module p2p {
	requires fastjson;
	requires java.desktop;
	requires java.logging;
	requires java.sql;
	opens pojo to fastjson;
	opens pojo.message to fastjson;
}