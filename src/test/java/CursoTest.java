import br.com.csribeiro.dao.CursoDao;
import br.com.csribeiro.dao.ICursoDao;
import br.com.csribeiro.domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {
    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE");
        curso.setNome("Curso de Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}

