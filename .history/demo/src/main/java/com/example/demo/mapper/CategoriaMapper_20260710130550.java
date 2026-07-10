

import org.springframework.stereotype.Component;

import com.example.dto.CategoriaRequestDto;
import com.example.dto.CategoriaResponseDto;
import com.example.model.Categoria;

@Component
public class CategoriaMapper {
    public CategoriaResponseDto toResponseDto (Categoria categoria){
        if (categoria ==null){
            return null;
        }

        return new CategoriaResponseDto(
            categoria.getId(),
            categoria.getNome()
        );
    }

    public Categoria toEntity(CategoriaRequestDto dto){
        if (dto == null){
            return null;
        }
        return new Categoria(
            dto.nome()
        );
    }
    
}
