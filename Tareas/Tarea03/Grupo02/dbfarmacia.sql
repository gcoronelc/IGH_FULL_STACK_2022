-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-06-2022 a las 22:35:29
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbfarmacia`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AgregarCategoria` (OUT `_IDCat` INT, IN `_NombreCat` VARCHAR(45))  BEGIN
	INSERT INTO categoria(NombreCat) VALUES (_NombreCat);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AgregarEmpleado` (IN `_DNI` INT, IN `_NombreEmp` VARCHAR(45), IN `_ApellidoEmp` VARCHAR(45), IN `_DireccionEmp` VARCHAR(45), IN `_TelefonoEmp` VARCHAR(45), IN `_FechaEmp` DATE, IN `_ContraseñaEmp` VARCHAR(45), IN `_IDTEmp` INT)  BEGIN
	INSERT INTO empleado(DNI,NombreEmp,ApellidoEmp,DireccionEmp,TelefonoEmp,FechaEmp,ContraseñaEmp,IDTEmp) VALUES (_DNI,_NombreEmp,_ApellidoEmp,_DireccionEmp,_TelefonoEmp,_FechaEmp,_ContraseñaEmp,_IDTEmp);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_AgregarTipo` (OUT `_IDTEmp` INT, IN `_NombreTEmp` VARCHAR(45))  BEGIN
	INSERT INTO tipo_empleado(NombreTEmp) VALUES (_NombreTEmp);
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `IDCat` int(11) NOT NULL,
  `NombreCat` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`IDCat`, `NombreCat`) VALUES
(1, 'Medicina'),
(2, 'Mama y Bebé'),
(3, 'Medición'),
(4, 'Cuidado Personal'),
(5, 'Suplementos'),
(6, 'Cosmeticos'),
(7, 'Juguetes y Regalos'),
(8, 'Utensilio Medico'),
(9, 'ProductoB');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `DNI` int(11) NOT NULL,
  `NombreEmp` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `ApellidoEmp` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `DireccionEmp` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `TelefonoEmp` varchar(45) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `FechaEmp` date DEFAULT NULL,
  `ContraseñaEmp` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `IDTEmp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`DNI`, `NombreEmp`, `ApellidoEmp`, `DireccionEmp`, `TelefonoEmp`, `FechaEmp`, `ContraseñaEmp`, `IDTEmp`) VALUES
(12345678, 'Alberto', 'Limas', 'MZ C2 Lt 5L Zapallal', '', '2020-11-11', '12345678', 1),
(55555555, 'Juan', 'Manco', 'Centro de Lima', '', '2020-02-02', '321456', 3),
(75115915, 'Carlos', 'Leonard', 'Mz C5 Lt Puente Piedra', '', '2020-10-10', '1234', 2),
(87456321, 'Cristian', 'Egusquiza', 'Avenida San Martin', '', '2020-11-04', '12345', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entradas`
--

CREATE TABLE `entradas` (
  `IDEntra` int(11) NOT NULL,
  `CantidadEntra` int(11) DEFAULT NULL,
  `FechaEntra` date DEFAULT NULL,
  `DNI` int(11) NOT NULL,
  `IDProd` int(11) NOT NULL,
  `TipoEntra` varchar(60) COLLATE utf8mb4_spanish2_ci NOT NULL,
  `IDProv` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `entradas`
--

INSERT INTO `entradas` (`IDEntra`, `CantidadEntra`, `FechaEntra`, `DNI`, `IDProd`, `TipoEntra`, `IDProv`) VALUES
(1, 70, '2020-12-13', 12345678, 1, 'Por compra', 2),
(2, 40, '2020-12-13', 12345678, 2, 'Por compra', 2),
(3, 20, '2020-12-13', 12345678, 3, 'Por compra', 2),
(4, 50, '2020-12-13', 12345678, 4, 'Por compra', 2),
(5, 10, '2020-12-13', 12345678, 5, 'Por compra', 2),
(6, 30, '2020-12-13', 12345678, 6, 'Por compra', 3),
(7, 15, '2020-12-13', 12345678, 7, 'Por compra', 2),
(8, 30, '2020-12-13', 12345678, 8, 'Por compra', 2),
(9, 30, '2020-12-13', 12345678, 9, 'Por compra', 2),
(10, 30, '2020-12-13', 12345678, 10, 'Por compra', 2),
(11, 30, '2020-12-13', 12345678, 11, 'Por compra', 2),
(12, 15, '2020-12-13', 12345678, 12, 'Por compra', 2),
(13, 20, '2020-12-13', 12345678, 13, 'Por compra', 2),
(14, 30, '2020-12-13', 12345678, 14, 'Por compra', 3),
(15, 200, '2020-12-13', 12345678, 15, 'Por compra', 2),
(16, 20, '2020-12-13', 12345678, 16, 'Por compra', 3),
(17, 30, '2020-12-13', 12345678, 17, 'Por compra', 5),
(18, 30, '2020-12-13', 12345678, 18, 'Por compra', 5),
(19, 25, '2020-12-13', 12345678, 19, 'Por compra', 5),
(20, 20, '2020-12-13', 12345678, 20, 'Por compra', 5),
(21, 12, '2020-12-13', 12345678, 21, 'Por compra', 5),
(22, 12, '2020-12-13', 12345678, 22, 'Por compra', 5),
(23, 25, '2020-12-13', 12345678, 23, 'Por compra', 5),
(24, 15, '2020-12-13', 12345678, 24, 'Por compra', 6),
(25, 10, '2020-12-13', 12345678, 25, 'Por compra', 6),
(26, 8, '2020-12-13', 12345678, 26, 'Por compra', 6),
(27, 5, '2020-12-13', 12345678, 27, 'Por compra', 6),
(28, 10, '2020-12-13', 12345678, 28, 'Por compra', 6),
(29, 15, '2020-12-13', 12345678, 29, 'Por compra', 6),
(30, 20, '2020-12-13', 12345678, 30, 'Por compra', 5),
(31, 20, '2020-12-13', 12345678, 31, 'Por compra', 5),
(32, 20, '2020-12-13', 12345678, 32, 'Por compra', 5),
(33, 20, '2020-12-13', 12345678, 33, 'Por compra', 5),
(34, 10, '2020-12-13', 12345678, 34, 'Por compra', 5),
(35, 35, '2020-12-13', 12345678, 35, 'Por compra', 5),
(36, 15, '2020-12-13', 12345678, 36, 'Por compra', 5),
(37, 20, '2020-12-13', 12345678, 37, 'Por compra', 5),
(38, 20, '2020-12-13', 12345678, 38, 'Por compra', 2),
(39, 10, '2020-12-13', 12345678, 39, 'Por compra', 5),
(40, 10, '2020-12-13', 12345678, 40, 'Por compra', 5),
(41, 15, '2020-12-13', 12345678, 41, 'Por compra', 5),
(42, 30, '2020-12-13', 12345678, 42, 'Por compra', 5),
(43, 15, '2020-12-13', 12345678, 43, 'Por compra', 7),
(44, 10, '2020-12-13', 12345678, 44, 'Por compra', 7),
(45, 10, '2020-12-13', 12345678, 45, 'Por compra', 7),
(46, 10, '2020-12-13', 12345678, 46, 'Por compra', 7),
(47, 11, '2020-12-13', 12345678, 47, 'Por compra', 7),
(48, 11, '2020-12-13', 12345678, 48, 'Por compra', 5),
(49, 20, '2020-12-13', 12345678, 49, 'Por compra', 4),
(50, 15, '2020-12-13', 12345678, 50, 'Por compra', 4),
(51, 20, '2020-12-13', 12345678, 51, 'Por compra', 5),
(52, 25, '2020-12-13', 12345678, 52, 'Por compra', 4),
(53, 20, '2020-12-13', 12345678, 53, 'Por compra', 4),
(54, 5, '2020-12-13', 12345678, 54, 'Por compra', 4),
(55, 5, '2020-12-13', 12345678, 55, 'Por compra', 5),
(56, 5, '2020-12-13', 12345678, 56, 'Por compra', 5),
(57, 22, '2020-12-13', 12345678, 57, 'Por compra', 5),
(58, 5, '2020-12-13', 12345678, 58, 'Por compra', 5),
(59, 5, '2020-12-13', 12345678, 59, 'Por compra', 5),
(60, 15, '2020-12-13', 12345678, 60, 'Por compra', 5),
(61, 1, '2020-09-03', 87456321, 27, 'Por devolución', 1),
(62, 20, '2020-09-03', 87456321, 1, 'Por compra', 2),
(63, 13, '2020-09-03', 87456321, 2, 'Por compra', 2),
(64, 8, '2020-09-03', 87456321, 3, 'Por compra', 2),
(65, 9, '2020-09-03', 87456321, 4, 'Por compra', 2),
(66, 6, '2020-09-03', 87456321, 5, 'Por compra', 2),
(67, 13, '2020-09-04', 87456321, 11, 'Por compra', 6),
(68, 13, '2020-09-04', 87456321, 12, 'Por compra', 2),
(69, 8, '2020-09-04', 87456321, 13, 'Por compra', 6),
(70, 1, '2020-09-04', 87456321, 14, 'Por compra', 6),
(71, 15, '2020-09-04', 87456321, 16, 'Por compra', 6),
(72, 4, '2020-09-04', 87456321, 21, 'Por compra', 5),
(73, 8, '2020-09-04', 87456321, 24, 'Por compra', 6),
(74, 5, '2020-09-04', 87456321, 25, 'Por compra', 6),
(75, 3, '2020-09-04', 87456321, 32, 'Otro', 1),
(76, 5, '2020-09-04', 87456321, 34, 'Por compra', 5),
(77, 2, '2020-09-04', 87456321, 38, 'Por compra', 2),
(78, 7, '2020-09-04', 87456321, 40, 'Por compra', 5),
(79, 5, '2020-09-04', 87456321, 59, 'Por compra', 5),
(80, 8, '2020-09-04', 87456321, 60, 'Por compra', 5),
(81, 6, '2020-09-04', 87456321, 58, 'Por compra', 5),
(82, 5, '2020-09-04', 87456321, 54, 'Por compra', 4),
(83, 3, '2020-09-04', 87456321, 55, 'Por compra', 5),
(84, 2, '2020-12-13', 12345678, 14, 'Por compra', 6),
(85, 8, '2020-10-15', 75115915, 1, 'Por compra', 2),
(86, 12, '2020-10-15', 75115915, 2, 'Por compra', 2),
(87, 4, '2020-10-15', 75115915, 4, 'Por compra', 2),
(88, 6, '2020-10-15', 75115915, 11, 'Por compra', 6),
(89, 10, '2020-10-15', 75115915, 22, 'Por compra', 5),
(90, 1, '2020-10-15', 75115915, 26, 'Por compra', 6),
(91, 6, '2020-10-15', 75115915, 33, 'Por compra', 5),
(92, 1000, '2022-06-09', 12345678, 59, 'Por compra', 1),
(93, 1000, '2022-06-09', 12345678, 61, 'Por compra', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `IDProd` int(11) NOT NULL,
  `NombreProd` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `DescripcionProd` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL,
  `PrecioProd` double DEFAULT NULL,
  `StockProd` int(11) DEFAULT NULL,
  `IDCat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`IDProd`, `NombreProd`, `DescripcionProd`, `PrecioProd`, `StockProd`, `IDCat`) VALUES
(1, 'Paracetamol 500mg', 'Bloque C', 0.5, 30, 1),
(2, 'Bismutol Tabletas', 'Bloque C', 1.4, 30, 1),
(3, 'Bismutol Jarabe', 'Bloque D', 18.5, 20, 1),
(4, 'Sal de Andrews', 'Bloque C', 0.5, 15, 1),
(5, 'Leche Magnesia', 'Bloque D', 8.5, 10, 1),
(6, 'Vitamina C 1000 mg + Zinc mg', 'Bloque C', 14, 17, 1),
(7, 'Ácido Fólico', 'Bloque D', 38, 13, 1),
(8, 'Alcohol Medicinal 96° 1L', 'Bloque D', 12, 19, 1),
(9, 'Alcohol en Gel 70° 1L', 'Bloque D', 25, 21, 1),
(10, 'Cinta Quirúrgica de Plastico', 'Bloque B', 10, 23, 8),
(11, 'Venda Elastica', 'Bloque B', 3, 20, 8),
(12, 'Agua Oxigenada 1L', 'Bloque D', 5.4, 12, 1),
(13, 'Algodon Grande', 'Bloque B', 8.9, 20, 8),
(14, 'Algodón Pequeño', 'Bloque B', 2.9, 10, 8),
(15, 'Curita CureBand xUnidad', 'Bloque B', 0.1, 121, 8),
(16, 'Jeringa 10 ml', 'Bloque B', 1.5, 12, 8),
(17, 'Pañal Pampers Talla XXG', 'Bloque A', 64.3, 24, 2),
(18, 'Pañal Huggies Talla XG', 'Bloque A', 56.9, 23, 2),
(19, 'Babylac Lata 400g ', 'Bloque A', 45.9, 18, 2),
(20, 'Similac Lata 8500g ', 'Bloque A', 59.9, 16, 2),
(21, 'Crema Protectora Eucerin 100G', 'Bloque A', 49.9, 15, 2),
(22, 'Crema Regeneradora Ninet 35g', 'Bloque A', 9.9, 15, 2),
(23, 'Gel Dental Vitis', 'Bloque A', 16.5, 15, 2),
(24, 'Termómetro Oral', 'Bloque E', 2, 10, 3),
(25, 'Termometro Digital Med Cell', 'Bloque E', 24, 10, 3),
(26, 'Oximetro de Pulso', 'Bloque E', 90, 5, 3),
(27, 'Tensiométro', 'Bloque E', 206, 4, 3),
(28, 'Medido de Glucosa', 'Bloque E', 114, 6, 3),
(29, 'Tiras de Prueba de Glucosa', 'Bloque E', 89.5, 8, 3),
(30, 'Crema Dental Colgate', 'Bloque F', 8.5, 7, 4),
(31, '\'Crema Dental Totaldent', 'Bloque F', 3.9, 8, 4),
(32, 'Cepillo Kolinos Master', 'Bloque F', 1.8, 9, 4),
(33, 'Colgate Cepillo Premier', 'Bloque F', 2.2, 10, 4),
(34, 'Shampoo Johnsons  1L', 'Bloque A', 14.7, 10, 2),
(35, 'Shampoo en Sashet', 'Bloque F', 0.7, 20, 4),
(36, 'Jabon Neutro', 'Bloque F', 5.5, 10, 4),
(37, 'Desodorante Old Spice', 'Bloque F', 12.9, 12, 4),
(38, 'Protector Solar Sashet', 'Bloque F', 1.2, 7, 4),
(39, 'Protector Solar 200 ml', 'Bloque F', 33, 5, 4),
(40, 'Gel Moco de Gorila', 'Bloque F', 17.9, 9, 4),
(41, 'Lubricante 200 ml', 'Bloque F', 10.5, 8, 4),
(42, 'Preservativo Durex 3 Unidades', 'Bloque F', 6.5, 13, 4),
(43, 'Colágeno Polvo-Caja', 'Bloque G', 53.5, 14, 5),
(44, 'Vitagel Colágeno Hidrolizado ', 'Bloque G', 159, 7, 5),
(45, 'Generador de Colágeno Biosil ', 'Bloque G', 139.5, 10, 5),
(46, 'Energiforte G2 x30 Unidades', 'Bloque G', 120, 9, 5),
(47, 'Hidrolageno Q10 Sobre', 'Bloque G', 129.5, 11, 5),
(48, 'Talco Kalos 140 gr', 'Bloque F', 17.9, 8, 4),
(49, 'Delineador de Ojos', 'Bloque H', 12.5, 14, 6),
(50, 'Crema Facial Antiarrugas', 'Bloque G', 32.5, 8, 6),
(51, 'Talco Para Pies', 'Bloque F', 17.5, 15, 4),
(52, 'Lapiz Labial Rojo', 'Bloque H', 8.5, 18, 6),
(53, 'Brillo Labial', 'Bloque H', 14.3, 15, 6),
(54, 'Colonia Pulso 500 ml ', 'Bloque H', 36.5, 5, 6),
(55, 'Peluche Oso Mediano', 'Bloque I', 24, 5, 7),
(56, 'Collar de Plata', 'Bloque I', 52, 1, 7),
(57, 'Baraja de Cartas', 'Bloque I', 2.5, 7, 7),
(58, 'Ajedrez+Ludo+Damas', 'Bloque I', 16.5, 6, 7),
(59, 'Peluche Pokemon', 'Bloque I', 21, 1004, 7),
(60, 'Cubo de Rubik', 'Bloque I', 4, 8, 7),
(61, 'NuevoP', 'no tiene', 150, 1000, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `IDProv` int(11) NOT NULL,
  `NombreProv` varchar(45) DEFAULT NULL,
  `EspecialidadProv` varchar(45) DEFAULT NULL,
  `DireccionProv` varchar(45) DEFAULT NULL,
  `TelefonoProv` varchar(45) DEFAULT NULL,
  `CorreoProv` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`IDProv`, `NombreProv`, `EspecialidadProv`, `DireccionProv`, `TelefonoProv`, `CorreoProv`) VALUES
(1, 'Ninguno', 'Ninguno', 'Ninguno', '0000', 'Ninguno'),
(2, 'LABORATORIO MEDIFARMA S.A.', 'Medicamentos', 'Jr. Ecuador 787 Lima - Perú', '5541478', 'medifarma.sa@gmail.com'),
(3, 'FARMINDUSTRIA S.A.', 'Medicamentos', 'Cercado de Lima 15073, Perú', '12535303', 'mdominguez@farmindustria.com.pe'),
(4, 'LABORATORIO LACOVAT  EIRLtda', 'Cosmeticos', 'Lince 15073, Perú', '26622209', 'ventas@cosmeticabrillant.com'),
(5, 'KIMBERLY CLARK PERU S.A.', 'Cuidado Personal-Mama y Bebé ', 'Av. Paseo de la Republica 5895', '5210025', 'kimberly.sa.produc@gmail.com'),
(6, 'SONIMEDICA PERU S.A.C', 'Equipo Medico', 'Carretera Pativilca  2461 Huari ', '945017294', 'ventasc@equipamientomedico.com.pe'),
(7, 'LEVAMET', 'Suplementos', 'Calle San Patricio MZ R1 Lote 10 Urb.', '7192170', 'empresa@lemavetperu.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas`
--

CREATE TABLE `salidas` (
  `IDSali` int(11) NOT NULL,
  `FechaSali` date DEFAULT NULL,
  `PrecioSali` double DEFAULT NULL,
  `DNI` int(11) NOT NULL,
  `TipoSali` varchar(60) COLLATE utf8mb4_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `salidas`
--

INSERT INTO `salidas` (`IDSali`, `FechaSali`, `PrecioSali`, `DNI`, `TipoSali`) VALUES
(1, '2020-12-13', 4.3, 75115915, 'Por venta'),
(2, '2020-09-01', 1, 75115915, 'Por venta'),
(3, '2020-09-01', 38.8, 75115915, 'Por venta'),
(4, '2020-09-01', 33, 75115915, 'Pérdida de existencia'),
(5, '2020-09-01', 69, 75115915, 'Por venta'),
(6, '2020-09-01', 21, 75115915, 'Por venta'),
(7, '2020-09-02', 11.8, 75115915, 'Por venta'),
(8, '2020-09-02', 6.5, 75115915, 'Por caducidad'),
(9, '2020-09-02', 45, 75115915, 'Por venta'),
(10, '2020-09-02', 13, 75115915, 'Por venta'),
(11, '2020-09-02', 18.5, 75115915, 'Por venta'),
(12, '2020-09-02', 17.9, 75115915, 'Por venta'),
(13, '2020-09-02', 5.8, 75115915, 'Otro'),
(14, '2020-09-02', 45, 75115915, 'Por venta'),
(15, '2020-09-02', 45.9, 75115915, 'Por venta'),
(16, '2020-09-03', 206, 75115915, 'Por venta'),
(17, '2020-09-03', 2.5999999999999996, 75115915, 'Por venta'),
(18, '2020-09-03', 0.7, 75115915, 'Por venta'),
(19, '2020-09-04', 120, 75115915, 'Por venta'),
(20, '2020-09-05', 17.9, 75115915, 'Por venta'),
(21, '2020-09-07', 73, 75115915, 'Por venta'),
(22, '2020-09-07', 12.9, 75115915, 'Por venta'),
(23, '2020-09-07', 55.5, 75115915, 'Por venta'),
(24, '2020-09-07', 49.9, 75115915, 'Por venta'),
(25, '2020-09-08', 2, 75115915, 'Otro'),
(26, '2020-09-08', 16.5, 75115915, 'Por venta'),
(27, '2020-09-08', 16.3, 75115915, 'Por venta'),
(28, '2020-09-09', 33.5, 75115915, 'Por venta'),
(29, '2020-09-09', 15, 75115915, 'Por venta'),
(30, '2020-09-09', 17.9, 75115915, 'Por venta'),
(31, '2020-09-11', 38.3, 75115915, 'Por venta'),
(32, '2020-09-11', 10.5, 75115915, 'Por venta'),
(33, '2020-09-12', 17.9, 75115915, 'Por venta'),
(34, '2020-09-14', 16.8, 75115915, 'Por venta'),
(35, '2020-09-14', 49.9, 75115915, 'Por venta'),
(36, '2020-09-14', 23, 75115915, 'Por venta'),
(37, '2020-09-15', 2.4, 75115915, 'Por caducidad'),
(38, '2020-09-15', 101.5, 75115915, 'Por venta'),
(39, '2020-09-16', 20.799999999999997, 75115915, 'Por venta'),
(40, '2020-09-16', 9.5, 75115915, 'Por venta'),
(41, '2020-09-17', 178.1, 75115915, 'Por venta'),
(42, '2020-09-17', 64.3, 75115915, 'Por venta'),
(43, '2020-09-18', 3, 75115915, 'Otro'),
(44, '2020-09-18', 34, 75115915, 'Por venta'),
(45, '2020-09-19', 25.8, 75115915, 'Por venta'),
(46, '2020-09-19', 83.9, 75115915, 'Por venta'),
(47, '2020-09-19', 17.9, 75115915, 'Por caducidad'),
(48, '2020-09-19', 49, 75115915, 'Por venta'),
(49, '2020-09-21', 12.5, 75115915, 'Otro'),
(50, '2020-09-21', 28.9, 75115915, 'Por venta'),
(51, '2020-09-21', 24, 75115915, 'Por venta'),
(52, '2020-09-22', 74, 75115915, 'Por venta'),
(53, '2020-09-22', 10.6, 75115915, 'Por venta'),
(54, '2020-09-23', 36.2, 75115915, 'Por venta'),
(55, '2020-09-23', 16.5, 75115915, 'Por venta'),
(56, '2020-09-24', 212.5, 75115915, 'Por venta'),
(57, '2020-09-24', 23.5, 75115915, 'Por venta'),
(58, '2020-09-24', 27.8, 75115915, 'Por venta'),
(59, '2020-09-25', 36.5, 75115915, 'Otro'),
(60, '2020-09-25', 88.5, 75115915, 'Por venta'),
(61, '2020-09-25', 24.8, 75115915, 'Por venta'),
(62, '2020-09-26', 8.5, 75115915, 'Pérdida de existencia'),
(63, '2020-09-27', 47.9, 75115915, 'Por venta'),
(64, '2020-09-27', 10.5, 75115915, 'Por caducidad'),
(65, '2020-09-27', 1.4, 75115915, 'Otro'),
(66, '2020-10-01', 21.4, 55555555, 'Por venta'),
(67, '2020-10-01', 45.9, 55555555, 'Por venta'),
(68, '2020-10-01', 4, 55555555, 'Otro'),
(69, '2020-10-01', 220, 55555555, 'Por venta'),
(70, '2020-10-02', 20.5, 55555555, 'Por venta'),
(71, '2020-10-02', 17.9, 55555555, 'Por venta'),
(72, '2020-10-02', 28.400000000000002, 55555555, 'Por venta'),
(73, '2020-10-03', 3.6, 55555555, 'Otro'),
(74, '2020-10-03', 36.5, 55555555, 'Pérdida de existencia'),
(75, '2020-10-04', 13.5, 55555555, 'Por venta'),
(76, '2020-10-04', 69, 55555555, 'Por venta'),
(77, '2020-10-05', 18.2, 55555555, 'Por venta'),
(78, '2020-10-05', 31.8, 55555555, 'Por venta'),
(79, '2020-10-05', 24, 55555555, 'Por venta'),
(80, '2020-10-06', 127.9, 55555555, 'Por venta'),
(81, '2020-10-06', 32.5, 55555555, 'Por venta'),
(82, '2020-10-07', 90, 55555555, 'Por venta'),
(83, '2020-10-07', 203.5, 55555555, 'Por venta'),
(84, '2020-10-08', 12, 55555555, 'Otro'),
(85, '2020-10-08', 12.3, 55555555, 'Por venta'),
(86, '2020-10-09', 33, 55555555, 'Por venta'),
(87, '2020-10-10', 6.5, 55555555, 'Por caducidad'),
(88, '2020-10-10', 114, 55555555, 'Por venta'),
(89, '2020-10-12', 62.7, 55555555, 'Por venta'),
(90, '2020-10-12', 6, 55555555, 'Por venta'),
(91, '2020-10-13', 105.8, 55555555, 'Por venta'),
(92, '2020-10-13', 36.5, 55555555, 'Por venta'),
(93, '2020-10-14', 17, 55555555, 'Otro'),
(94, '2020-10-14', 43.3, 55555555, 'Por venta'),
(95, '2020-10-14', 24, 55555555, 'Por venta'),
(96, '2020-10-15', 25.8, 55555555, 'Por venta'),
(97, '2020-10-15', 26, 55555555, 'Por venta'),
(98, '2020-10-15', 4, 55555555, 'Por venta'),
(99, '2020-10-16', 37.9, 55555555, 'Por venta'),
(100, '2020-10-16', 121.19999999999999, 55555555, 'Por venta'),
(101, '2020-10-17', 9.9, 55555555, 'Por caducidad'),
(102, '2020-10-17', 40, 55555555, 'Por venta'),
(103, '2020-10-19', 38.4, 55555555, 'Por venta'),
(104, '2020-10-19', 50.9, 55555555, 'Por venta'),
(105, '2020-10-20', 22.8, 55555555, 'Por venta'),
(106, '2020-10-20', 16.5, 55555555, 'Por venta'),
(107, '2020-10-21', 8, 55555555, 'Pérdida de existencia'),
(108, '2020-10-21', 24.4, 55555555, 'Por venta'),
(109, '2020-10-21', 114, 55555555, 'Por venta'),
(110, '2020-10-22', 37.3, 55555555, 'Por venta'),
(111, '2020-10-22', 5.8, 55555555, 'Por venta'),
(112, '2020-10-23', 20, 55555555, 'Pérdida de existencia'),
(114, '2020-10-24', 2.5, 55555555, 'Pérdida de existencia'),
(115, '2020-10-26', 24, 55555555, 'Por venta'),
(116, '2020-10-26', 90, 55555555, 'Por venta'),
(117, '2020-10-27', 17.9, 55555555, 'Por venta'),
(118, '2020-11-02', 15.8, 87456321, 'Por venta'),
(119, '2020-11-02', 5, 87456321, 'Por venta'),
(120, '2020-11-02', 8.8, 87456321, 'Por venta'),
(121, '2020-11-03', 101.6, 87456321, 'Por venta'),
(122, '2020-11-03', 30.200000000000003, 87456321, 'Por venta'),
(123, '2020-11-04', 68.5, 87456321, 'Por venta'),
(124, '2020-11-04', 24, 87456321, 'Por venta'),
(125, '2020-11-05', 23.8, 87456321, 'Por venta'),
(127, '2020-11-06', 206, 87456321, 'Por venta'),
(128, '2020-11-06', 16.5, 87456321, 'Por caducidad'),
(129, '2020-11-07', 20.5, 87456321, 'Por venta'),
(130, '2020-11-07', 69.8, 87456321, 'Por venta'),
(131, '2020-11-08', 35, 87456321, 'Por venta'),
(132, '2020-11-08', 8.3, 87456321, 'Por venta'),
(133, '2020-11-09', 9, 87456321, 'Pérdida de existencia'),
(134, '2020-11-09', 10.5, 87456321, 'Por venta'),
(135, '2020-11-10', 51, 87456321, 'Por venta'),
(136, '2020-11-10', 3, 87456321, 'Por venta'),
(137, '2020-11-11', 159.7, 87456321, 'Por venta'),
(138, '2020-11-11', 92.9, 87456321, 'Por venta'),
(139, '2020-11-12', 108, 87456321, 'Por venta'),
(140, '2020-11-12', 128.3, 87456321, 'Por venta'),
(141, '2020-11-13', 56.9, 87456321, 'Por venta'),
(142, '2020-11-13', 192, 87456321, 'Por venta'),
(143, '2020-11-14', 15, 87456321, 'Por venta'),
(144, '2020-11-14', 8.5, 87456321, 'Otro'),
(145, '2020-11-14', 33.3, 87456321, 'Por venta'),
(146, '2020-11-16', 16.4, 87456321, 'Por venta'),
(147, '2020-11-16', 3.9, 87456321, 'Por venta'),
(148, '2020-11-17', 24.6, 87456321, 'Por venta'),
(149, '2020-11-18', 12.9, 87456321, 'Por caducidad'),
(150, '2020-11-18', 47.5, 87456321, 'Por venta'),
(151, '2020-11-19', 69.8, 87456321, 'Por venta'),
(152, '2020-11-20', 22.2, 87456321, 'Otro'),
(153, '2020-11-20', 64.3, 87456321, 'Por venta'),
(154, '2020-11-21', 8.8, 87456321, 'Por venta'),
(155, '2020-11-23', 11.2, 87456321, 'Pérdida de existencia'),
(156, '2020-11-23', 14.3, 87456321, 'Por venta'),
(157, '2020-11-24', 111.69999999999999, 87456321, 'Por venta'),
(158, '2020-11-24', 2, 87456321, 'Por venta'),
(159, '2020-11-25', 66.6, 87456321, 'Por venta'),
(160, '2020-11-26', 25, 87456321, 'Por venta'),
(161, '2020-11-27', 165.5, 87456321, 'Por venta'),
(162, '2020-11-28', 41.5, 87456321, 'Por venta'),
(163, '2020-12-01', 3.4, 87456321, 'Por venta'),
(164, '2020-12-01', 14, 87456321, 'Por venta'),
(165, '2020-12-01', 13.8, 87456321, 'Por venta'),
(166, '2020-12-02', 9.9, 87456321, 'Por caducidad'),
(167, '2020-12-02', 21, 87456321, 'Por venta'),
(168, '2020-12-02', 59.9, 87456321, 'Por venta'),
(169, '2020-12-03', 11.6, 87456321, 'Otro'),
(170, '2020-12-03', 30.5, 87456321, 'Por venta'),
(171, '2020-12-03', 49.7, 87456321, 'Por venta'),
(172, '2020-12-04', 8, 87456321, 'Otro'),
(173, '2020-12-04', 73, 87456321, 'Por venta'),
(174, '2020-12-05', 10.700000000000001, 87456321, 'Por venta'),
(175, '2020-12-05', 10, 87456321, 'Pérdida de existencia'),
(176, '2020-12-07', 44, 87456321, 'Por venta'),
(177, '2020-12-07', 72.7, 87456321, 'Por venta'),
(178, '2020-12-07', 90.7, 87456321, 'Por venta'),
(179, '2020-12-07', 13, 87456321, 'Por caducidad'),
(180, '2020-12-07', 34, 87456321, 'Por venta'),
(181, '2020-12-07', 9.5, 87456321, 'Por venta'),
(182, '2020-12-08', 16.5, 87456321, 'Otro'),
(183, '2020-12-09', 16.9, 87456321, 'Por venta'),
(184, '2020-12-09', 76.9, 87456321, 'Por venta'),
(185, '2020-12-09', 19.8, 87456321, 'Por caducidad'),
(186, '2020-12-10', 38.4, 87456321, 'Por venta'),
(187, '2020-12-10', 52, 87456321, 'Por venta'),
(188, '2020-12-10', 7.9, 87456321, 'Por venta'),
(189, '2020-12-10', 5.8, 87456321, 'Por venta'),
(190, '2020-12-10', 17.9, 87456321, 'Pérdida de existencia'),
(191, '2020-12-12', 58, 87456321, 'Por venta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas_detalle`
--

CREATE TABLE `salidas_detalle` (
  `IDSalidaDet` int(11) NOT NULL,
  `CantidadSali` int(11) DEFAULT NULL,
  `IDProd` int(11) NOT NULL,
  `IDSali` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `salidas_detalle`
--

INSERT INTO `salidas_detalle` (`IDSalidaDet`, `CantidadSali`, `IDProd`, `IDSali`) VALUES
(1, 3, 1, 1),
(2, 2, 2, 1),
(5, 2, 4, 2),
(6, 2, 12, 3),
(7, 1, 9, 3),
(8, 1, 11, 3),
(9, 1, 39, 4),
(10, 1, 50, 5),
(11, 1, 54, 5),
(12, 1, 59, 6),
(13, 3, 1, 7),
(14, 2, 2, 7),
(15, 3, 4, 7),
(16, 2, 11, 7),
(17, 1, 42, 8),
(18, 1, 54, 9),
(19, 1, 52, 9),
(20, 2, 60, 10),
(21, 2, 57, 10),
(22, 1, 33, 11),
(23, 1, 30, 11),
(24, 2, 31, 11),
(25, 2, 35, 12),
(26, 1, 23, 12),
(27, 2, 14, 13),
(28, 3, 1, 14),
(29, 1, 3, 14),
(30, 1, 9, 14),
(31, 1, 19, 15),
(32, 1, 27, 16),
(33, 2, 35, 17),
(34, 1, 38, 17),
(35, 1, 35, 18),
(36, 1, 46, 19),
(37, 1, 48, 20),
(38, 1, 56, 21),
(39, 1, 59, 21),
(44, 3, 1, 23),
(45, 3, 6, 23),
(46, 1, 8, 23),
(47, 5, 13, 24),
(48, 1, 12, 24),
(49, 1, 24, 25),
(50, 1, 23, 26),
(51, 2, 32, 27),
(52, 1, 22, 27),
(53, 2, 2, 27),
(54, 1, 5, 28),
(55, 1, 9, 28),
(56, 2, 11, 29),
(57, 1, 4, 29),
(58, 1, 30, 29),
(59, 1, 48, 30),
(60, 1, 55, 31),
(61, 1, 53, 31),
(62, 2, 60, 32),
(63, 1, 57, 32),
(64, 1, 40, 33),
(65, 1, 34, 34),
(66, 3, 35, 34),
(67, 1, 21, 35),
(68, 2, 14, 36),
(69, 3, 11, 36),
(70, 3, 2, 36),
(71, 2, 1, 36),
(72, 10, 15, 36),
(73, 1, 24, 36),
(74, 2, 38, 37),
(75, 1, 36, 38),
(76, 1, 29, 38),
(77, 1, 42, 38),
(78, 1, 60, 39),
(79, 1, 37, 39),
(80, 1, 31, 39),
(81, 3, 4, 40),
(82, 5, 2, 40),
(83, 2, 1, 40),
(84, 1, 17, 41),
(85, 2, 18, 41),
(86, 1, 17, 42),
(87, 2, 16, 43),
(88, 2, 41, 44),
(89, 2, 42, 44),
(90, 2, 37, 45),
(91, 2, 39, 46),
(92, 1, 40, 46),
(93, 1, 40, 47),
(94, 1, 50, 48),
(95, 1, 58, 48),
(96, 1, 49, 49),
(97, 2, 35, 50),
(98, 1, 42, 50),
(99, 1, 59, 50),
(100, 1, 25, 51),
(101, 2, 8, 52),
(102, 2, 9, 52),
(103, 10, 1, 53),
(104, 4, 2, 53),
(105, 1, 23, 54),
(106, 1, 33, 54),
(107, 1, 51, 54),
(108, 1, 58, 55),
(109, 1, 43, 56),
(110, 1, 44, 56),
(111, 1, 41, 57),
(112, 2, 42, 57),
(113, 1, 52, 58),
(114, 1, 53, 58),
(115, 2, 57, 58),
(116, 1, 54, 59),
(117, 1, 56, 60),
(118, 1, 54, 60),
(119, 3, 1, 61),
(120, 2, 2, 61),
(121, 1, 5, 61),
(122, 1, 8, 61),
(123, 10, 15, 62),
(124, 1, 16, 62),
(125, 2, 11, 62),
(126, 1, 13, 63),
(127, 1, 6, 63),
(128, 1, 9, 63),
(129, 1, 30, 64),
(130, 4, 1, 64),
(131, 1, 2, 65),
(132, 2, 1, 66),
(133, 1, 2, 66),
(134, 1, 4, 66),
(135, 1, 3, 66),
(136, 1, 19, 67),
(137, 2, 24, 68),
(138, 2, 29, 69),
(139, 1, 50, 69),
(140, 1, 52, 69),
(141, 2, 60, 70),
(142, 1, 49, 70),
(143, 1, 40, 71),
(144, 2, 31, 72),
(145, 2, 30, 72),
(146, 2, 32, 72),
(147, 2, 32, 73),
(148, 1, 54, 74),
(149, 2, 33, 75),
(150, 2, 32, 75),
(151, 1, 36, 75),
(152, 1, 60, 76),
(153, 2, 50, 76),
(154, 1, 42, 77),
(155, 1, 41, 77),
(156, 1, 38, 77),
(157, 2, 57, 78),
(158, 1, 53, 78),
(159, 1, 49, 78),
(160, 1, 55, 79),
(161, 1, 31, 80),
(162, 1, 28, 80),
(163, 1, 10, 80),
(164, 1, 3, 81),
(165, 1, 6, 81),
(166, 1, 26, 82),
(167, 1, 29, 83),
(168, 1, 28, 83),
(169, 1, 8, 84),
(170, 2, 12, 85),
(171, 1, 16, 85),
(172, 1, 3, 86),
(173, 3, 1, 86),
(174, 2, 4, 86),
(175, 1, 8, 86),
(176, 1, 42, 87),
(177, 1, 25, 88),
(178, 1, 26, 88),
(179, 1, 23, 89),
(180, 1, 16, 89),
(181, 1, 7, 89),
(182, 3, 2, 89),
(183, 5, 1, 89),
(184, 2, 11, 90),
(185, 1, 20, 91),
(186, 1, 19, 91),
(187, 1, 23, 92),
(188, 3, 1, 92),
(189, 1, 3, 92),
(190, 2, 5, 93),
(191, 2, 6, 94),
(192, 2, 12, 94),
(193, 3, 16, 94),
(194, 1, 25, 95),
(195, 1, 37, 96),
(196, 2, 38, 96),
(197, 1, 41, 96),
(198, 2, 57, 97),
(199, 1, 59, 97),
(200, 1, 60, 98),
(201, 3, 42, 99),
(202, 1, 41, 99),
(203, 2, 38, 99),
(204, 1, 36, 99),
(205, 1, 17, 100),
(206, 1, 18, 100),
(207, 1, 22, 101),
(208, 1, 8, 102),
(209, 2, 6, 102),
(210, 5, 4, 103),
(211, 1, 3, 103),
(212, 1, 13, 103),
(213, 1, 30, 103),
(214, 1, 39, 104),
(215, 1, 40, 104),
(216, 1, 52, 105),
(217, 1, 53, 105),
(218, 1, 58, 106),
(219, 2, 60, 107),
(220, 1, 40, 108),
(221, 1, 42, 108),
(222, 1, 28, 109),
(223, 3, 30, 110),
(224, 2, 31, 110),
(225, 1, 32, 110),
(226, 1, 33, 110),
(227, 2, 14, 111),
(228, 2, 10, 112),
(230, 5, 1, 114),
(231, 2, 1, 115),
(232, 1, 8, 115),
(233, 3, 11, 115),
(234, 20, 15, 115),
(235, 1, 26, 116),
(236, 1, 40, 117),
(237, 2, 2, 118),
(238, 5, 1, 118),
(239, 1, 5, 118),
(240, 4, 4, 118),
(241, 2, 16, 119),
(242, 20, 15, 119),
(243, 2, 14, 120),
(244, 2, 16, 120),
(245, 1, 29, 121),
(246, 1, 30, 121),
(247, 2, 32, 121),
(248, 2, 33, 122),
(249, 2, 37, 122),
(250, 2, 51, 123),
(251, 1, 49, 123),
(252, 1, 59, 123),
(253, 1, 60, 124),
(254, 3, 57, 124),
(255, 1, 49, 124),
(256, 2, 38, 125),
(257, 1, 37, 125),
(258, 1, 30, 125),
(261, 1, 27, 127),
(262, 1, 23, 128),
(263, 2, 24, 129),
(264, 1, 23, 129),
(265, 1, 22, 130),
(266, 1, 20, 130),
(267, 5, 4, 131),
(268, 1, 6, 131),
(269, 1, 3, 131),
(270, 3, 4, 132),
(271, 1, 2, 132),
(272, 1, 12, 132),
(273, 3, 11, 133),
(274, 5, 4, 134),
(275, 2, 11, 134),
(276, 1, 24, 134),
(277, 1, 6, 135),
(278, 1, 8, 135),
(279, 1, 9, 135),
(280, 2, 16, 136),
(281, 2, 18, 137),
(282, 1, 19, 137),
(283, 2, 23, 138),
(284, 1, 20, 138),
(285, 1, 3, 139),
(286, 1, 29, 139),
(287, 1, 28, 140),
(288, 1, 30, 140),
(289, 2, 14, 140),
(290, 1, 18, 141),
(291, 1, 39, 142),
(292, 1, 44, 142),
(293, 1, 60, 143),
(294, 1, 57, 143),
(295, 1, 52, 143),
(296, 1, 52, 144),
(297, 1, 9, 145),
(298, 1, 12, 145),
(299, 1, 14, 145),
(300, 1, 10, 146),
(301, 1, 12, 146),
(302, 10, 15, 146),
(303, 1, 31, 147),
(304, 2, 33, 148),
(305, 1, 34, 148),
(306, 1, 36, 148),
(307, 2, 38, 149),
(308, 1, 41, 149),
(309, 1, 49, 150),
(310, 1, 50, 150),
(311, 1, 57, 150),
(312, 1, 20, 151),
(313, 1, 22, 151),
(314, 1, 13, 152),
(315, 5, 16, 152),
(316, 2, 14, 152),
(317, 1, 17, 153),
(318, 4, 15, 154),
(319, 1, 12, 154),
(320, 1, 11, 154),
(321, 2, 14, 155),
(322, 1, 12, 155),
(323, 2, 11, 156),
(324, 1, 12, 156),
(325, 1, 14, 156),
(326, 1, 19, 157),
(327, 1, 16, 157),
(328, 1, 17, 157),
(329, 1, 24, 158),
(330, 2, 25, 159),
(331, 1, 31, 159),
(332, 1, 34, 159),
(333, 1, 58, 160),
(334, 1, 52, 160),
(335, 1, 42, 161),
(336, 1, 44, 161),
(337, 2, 32, 162),
(338, 1, 30, 162),
(339, 2, 34, 162),
(340, 2, 1, 163),
(341, 1, 2, 163),
(342, 2, 4, 163),
(343, 1, 6, 164),
(344, 2, 12, 165),
(345, 1, 14, 165),
(346, 1, 15, 165),
(347, 1, 22, 166),
(348, 1, 6, 167),
(349, 2, 4, 167),
(350, 2, 11, 167),
(351, 1, 18, 168),
(352, 1, 32, 168),
(353, 1, 38, 168),
(354, 4, 14, 169),
(355, 1, 60, 170),
(356, 1, 57, 170),
(357, 1, 55, 170),
(358, 1, 53, 171),
(359, 1, 51, 171),
(360, 1, 48, 171),
(361, 4, 24, 172),
(362, 1, 56, 173),
(363, 1, 59, 173),
(364, 2, 33, 174),
(365, 1, 31, 174),
(366, 4, 15, 174),
(367, 1, 16, 174),
(368, 1, 4, 174),
(369, 1, 10, 175),
(370, 1, 7, 176),
(371, 2, 11, 176),
(372, 1, 12, 177),
(373, 2, 16, 177),
(374, 1, 17, 177),
(375, 1, 29, 178),
(376, 1, 38, 178),
(377, 2, 42, 179),
(378, 1, 51, 180),
(379, 1, 58, 180),
(380, 1, 60, 181),
(381, 1, 36, 181),
(382, 1, 23, 182),
(383, 3, 1, 183),
(384, 1, 2, 183),
(385, 4, 4, 183),
(386, 1, 8, 183),
(387, 1, 9, 184),
(388, 2, 11, 184),
(389, 1, 19, 184),
(390, 2, 22, 185),
(391, 1, 24, 186),
(392, 1, 31, 186),
(393, 1, 50, 186),
(394, 1, 56, 187),
(395, 5, 35, 188),
(396, 2, 33, 188),
(397, 2, 14, 189),
(398, 1, 40, 190),
(399, 2, 33, 191),
(400, 1, 38, 191),
(401, 1, 42, 191),
(402, 1, 19, 191);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_empleado`
--

CREATE TABLE `tipo_empleado` (
  `IDTEmp` int(11) NOT NULL,
  `NombreTEmp` varchar(45) COLLATE utf8mb4_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_spanish2_ci;

--
-- Volcado de datos para la tabla `tipo_empleado`
--

INSERT INTO `tipo_empleado` (`IDTEmp`, `NombreTEmp`) VALUES
(1, 'Administrador'),
(2, 'Vendedor'),
(3, 'Almacenero6'),
(4, 'MANTENIMIENTO1');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`IDCat`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `fk_Empleado_Tipo_empleado_idx` (`IDTEmp`);

--
-- Indices de la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`IDEntra`),
  ADD KEY `fk_Entradas_Empleado1_idx` (`DNI`),
  ADD KEY `fk_Entradas_Productos1_idx` (`IDProd`),
  ADD KEY `fk_Entradas_Proveedor1` (`IDProv`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`IDProd`),
  ADD KEY `fk_Productos_Categoria1_idx` (`IDCat`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`IDProv`);

--
-- Indices de la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD PRIMARY KEY (`IDSali`),
  ADD KEY `fk_Salidas_Empleado1_idx` (`DNI`);

--
-- Indices de la tabla `salidas_detalle`
--
ALTER TABLE `salidas_detalle`
  ADD PRIMARY KEY (`IDSalidaDet`),
  ADD KEY `fk_Salidas_detalle_Productos1_idx` (`IDProd`),
  ADD KEY `fk_Salidas_detalle_Salidas1_idx` (`IDSali`);

--
-- Indices de la tabla `tipo_empleado`
--
ALTER TABLE `tipo_empleado`
  ADD PRIMARY KEY (`IDTEmp`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `IDCat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `entradas`
--
ALTER TABLE `entradas`
  MODIFY `IDEntra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=94;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `IDProd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `IDProv` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `salidas`
--
ALTER TABLE `salidas`
  MODIFY `IDSali` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=192;

--
-- AUTO_INCREMENT de la tabla `salidas_detalle`
--
ALTER TABLE `salidas_detalle`
  MODIFY `IDSalidaDet` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=403;

--
-- AUTO_INCREMENT de la tabla `tipo_empleado`
--
ALTER TABLE `tipo_empleado`
  MODIFY `IDTEmp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_Empleado_Tipo_empleado` FOREIGN KEY (`IDTEmp`) REFERENCES `tipo_empleado` (`IDTEmp`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD CONSTRAINT `fk_Entradas_Empleado1` FOREIGN KEY (`DNI`) REFERENCES `empleado` (`DNI`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Entradas_Productos1` FOREIGN KEY (`IDProd`) REFERENCES `productos` (`IDProd`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Entradas_Proveedor1` FOREIGN KEY (`IDProv`) REFERENCES `proveedor` (`IDProv`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `fk_Productos_Categoria1` FOREIGN KEY (`IDCat`) REFERENCES `categoria` (`IDCat`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD CONSTRAINT `fk_Salidas_Empleado1` FOREIGN KEY (`DNI`) REFERENCES `empleado` (`DNI`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `salidas_detalle`
--
ALTER TABLE `salidas_detalle`
  ADD CONSTRAINT `fk_Salidas_detalle_Productos1` FOREIGN KEY (`IDProd`) REFERENCES `productos` (`IDProd`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Salidas_detalle_Salidas1` FOREIGN KEY (`IDSali`) REFERENCES `salidas` (`IDSali`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
