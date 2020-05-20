<!-- MODAL COMPONENT -->
<!-- PER ARA NOMES ES DECORATIU !! -->
<div class="modal fade" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
  aria-hidden="true">
    <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header text-center">
        <article class="card-body">
            <h4 class="card-title text-center mb-4 mt-1">Sign in</h4>
            <p>Nota:En aquesta práctica avaluem RWD i el login és decoratiu.</p>
            <hr>
            <p class="text-success text-center">Some message goes here</p>
            <!-- Per ara no tindrem funcionalitat -->
            <form action="./Productes?action=ListAll" method="get">
                <div class="form-group">
                <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-user"></i> </span>
                         </div>
                        <input name="" class="form-control" placeholder="Email or login" type="email">
                </div> <!-- input-group.// -->
                </div> <!-- form-group// -->
                <div class="form-group">
                <div class="input-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
                         </div>
                    <input class="form-control" placeholder="******" type="password">
                </div> <!-- input-group.// -->
                </div> <!-- form-group// -->
                <div class="form-group">
                    <button type="submit" class="btn btn-primary btn-block">Login</button>
                </div> <!-- form-group// -->
                <p class="text-center"><a href="#" class="btn">Forgot password?</a></p>
            </form>
        </article>
          </div>
        </div>
    </div>
</div> 
<!-- END MODAL COMPONENT -->