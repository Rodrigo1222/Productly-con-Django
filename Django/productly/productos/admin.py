from django.contrib import admin

from .models import Categoria, Producto
# Register your models here.

class CategoriaAdmin(admin.ModelAdmin):
    exclude = ("creado_en", )
    list_display = ("id", "nombre")

class ProductoAdmin(admin.ModelAdmin):
    exclude = ("creado_en", )
    list_display = ("id", "nombre", "stock", "puntaje", "categoria", "creado_en")

admin.site.register(Categoria, CategoriaAdmin)
admin.site.register(Producto, ProductoAdmin)
