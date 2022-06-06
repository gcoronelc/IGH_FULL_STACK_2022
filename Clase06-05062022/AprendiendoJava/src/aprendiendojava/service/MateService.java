package aprendiendojava.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware
 * @cursos gcoronelc.github.io
 */
public class MateService extends AbstrcatMateService{

	@Override
	public int sumar(int n1, int n2) {
		return (n1+n2);
	}

	@Override
	public int restar(int n1, int n2) {
		return (n1-n2);
	}

}
