package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {

    private Long id;
    private String name;
    private String email;

    @Override
    public boolean equals(Object obj) {
        final User otherObject = (User) obj;
        return new EqualsBuilder()
                .append(this.name, otherObject.name)
                .append(this.email, otherObject.email)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.name)
                .append(this.email)
                .toHashCode();
    }

}
