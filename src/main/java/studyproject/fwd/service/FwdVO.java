package studyproject.fwd.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FwdVO implements Serializable {
    private static final long serialVersionUID = -113106505703636632L;

    private int requestNumber;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this.requestNumber);
    }


}
