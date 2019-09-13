package Events;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Daniel
 */
@SarlSpecification("0.9")
@SarlElementType(15)
@SuppressWarnings("all")
public class buscarProductos extends Event {
  @SyntheticMember
  public buscarProductos() {
    super();
  }
  
  @SyntheticMember
  public buscarProductos(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private static final long serialVersionUID = 588368462L;
}
