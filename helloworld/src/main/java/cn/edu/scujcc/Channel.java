package cn.edu.scujcc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Channel")
public class Channel {
		@Id
		 String id;
		 String name;
		 String desc;
		public Channel() {
		
		 }
		 public Channel(String id,String name,String desc) {
				this.id=id;
				this.name=name;		
				this.desc=desc;
			}
		public String getDesc() {
				return desc;
			}
		public void setDesc(String desc) {
				this.desc = desc;
			}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
