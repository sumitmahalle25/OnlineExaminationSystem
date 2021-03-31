package in.com.online.exam.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class BaseDTO implements DropdownListBean, Comparable<BaseDTO> {
	/**
	 * Generic Attribute Id For All Child
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	protected long id;

	

	/**
	 * accessor
	 */

	/**
	 * @return ID of Child
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param Id
	 *            To set Child ID
	 */
	public void setId(long id) {
		this.id = id;
	}

	

	public int compareTo(BaseDTO next) {
		// TODO Auto-generated method stub
		return getValue().compareTo(next.getValue());
	}
}
