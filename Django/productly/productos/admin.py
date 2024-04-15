<<<<<<< HEAD
from django.contrib import admin
from .models import Categoria, Producto

class CategoriaAdmin(admin.ModelAdmin):
    list_display = ('id', 'nombre')

class ProductoAdmin(admin.ModelAdmin):
    exclude = ('creado_en', )
    list_display = ('id', 'nombre', 'stock', 'creado_en')
# Register your models here.
admin.site.register(Categoria, CategoriaAdmin)
=======
from django.contrib import admin
from .models import Categoria, Producto

class CategoriaAdmin(admin.ModelAdmin):
    list_display = ('id', 'nombre')

class ProductoAdmin(admin.ModelAdmin):
    exclude = ('creado_en', )
    list_display = ('id', 'nombre', 'stock', 'creado_en')
# Register your models here.
admin.site.register(Categoria, CategoriaAdmin)
>>>>>>> b7cb822dfda0ffac4f10db6cf43110db479e69b3
admin.site.register(Producto, ProductoAdmin)