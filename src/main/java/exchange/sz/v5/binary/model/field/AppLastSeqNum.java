package exchange.sz.v5.binary.model.field;

import exchange.sz.v5.binary.model.field.base.UInt16Field;
import lombok.AllArgsConstructor;

/**
 * @author xuejian.sun
 * @date 2019/12/9 16:45
 */
@AllArgsConstructor
public class AppLastSeqNum extends UInt16Field {

    public AppLastSeqNum(int appLastSeqNum) {
        super(appLastSeqNum);
    }
}
