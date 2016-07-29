<form method="post" action="cadastrar" enctype="multipart/form-data">
 <div class="form-group">
    <label for="nome">Nome</label>				  
    <input type="text" class="form-control" placeholder="nome" name="nome"/>				    
  </div>
  
  
  <div class="form-group">
    <label for="descricao">Descrição</label>
  	<textarea class="form-control" type="text" placeholder="Descrição" rows="3" name="descricao"></textarea>
  </div>
  
  
  <div class="form-group">
    <label for="exampleInputFile">File input</label>
    <input type="file" id="exampleInputFile" name="imagem" />
    <!-- <p class="help-block">Example block-level help text here.</p> -->
 </div>
 
 
 <button type="submit" class="btn btn-default">Submit</button>
  </form> 