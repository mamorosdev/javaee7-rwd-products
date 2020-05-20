<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- SECCIÓN PRODUCTOS -->
<div id="Productes" class="container-fluid">
<c:if test="${productes != null}">
   <!-- PRODUCTS CARD -->
    <div class="card">
        <h3 class="bg-success rounded">Productes del nostre servidoret.</h3>
        <div class="card-body">
            <div class="row">
                <c:forEach items="${productes}" var="producte">
                    <div class="col-sm-6 col-md-3">
                      <h4>${producte.nom}</h4>
                      <p>${producte.desc}</p>
                      <ul>
                      <c:forEach items="${producte.allergogens}" var="allergogen">
                          <li style="color:${allergogen.color}">${allergogen.nom}</li>
                      </c:forEach>
                      </ul>
                    </div>
                </c:forEach>
            </div>
        </div>
   </div> 
</c:if>
</div>
<!-- END PRODUCTS CARD -->
