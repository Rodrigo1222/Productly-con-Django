<<<<<<< HEAD
from django.urls import path
from . import views

app_name = 'productos'
urlpatterns = [
    path('', views.index, name='index'),
    path('formulario', views.formulario, name='formulario'),
    path('<int:producto_id>', views.detalle, name='detalle')
]
=======
from django.urls import path
from . import views

app_name = 'productos'
urlpatterns = [
    path('', views.index, name='index'),
    path('formulario', views.formulario, name='formulario'),
    path('<int:producto_id>', views.detalle, name='detalle')
]
>>>>>>> b7cb822dfda0ffac4f10db6cf43110db479e69b3
