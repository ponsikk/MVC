package web.rep;

import java.util.List;

public interface CarServiceRep {
    List<String> getCarsWithLimit(Integer count);
}
