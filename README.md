# GestionClubDeportivo

## Clases

- Club
- ActividadDeportiva
- Deportista
- Equipo
- Entrenador
- Cancha
- Partido

## Relaciones

- Un Club puede tener muchas actividades.
- Una ActividadDeportiva puede tener muchos deportistas.
- Un Deportista puede estar en un Equipo.
- Un Equipo puede tener un Entrenador, y un Equipo puede tener muchos Deportistas.
- Una Cancha puede tener de 1 a muchos Partidos.
- Un Partido puede tener de 1 a muchos Equipos.

## Atributos

- **Club**: `nombre`, `ubicacion`
- **ActividadDeportiva**: `nombre`, `partidoAsignado`
- **Deportista**: `idDeportista`, `nombre`, `apellido`, `contacto`, `deporte`
- **Equipo**: `deportistas`, `entrenador`
- **Entrenador**: `idEntrenador`, `nombre`, `experiencia`, `deporteAsignado`
- **Cancha**: `superficie`, `ubicacionClub`, `capacidadEspectadores`
- **Partido**: `equipos`, `canchaAsignada`, `resultado`
