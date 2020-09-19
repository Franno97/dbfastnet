package net.fastnet.dbfastnet.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.fastnet.dbfastnet.entities.Claim;
import net.fastnet.dbfastnet.interfaceService.IClaimService;
import net.fastnet.dbfastnet.interfaces.IClaim;

@Service
public class ClaimService implements IClaimService {
	
	@Autowired
	private IClaim data;
	
	@Override
	public List<Claim> list() {
		return (List<Claim>)data.findAll();
	}

	@Override
	public Optional<Claim> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Claim c) {
		int res=0;
		Claim claim=data.save(c);
		if(!claim.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
	
	public List<Claim> getAll() {
		List<Claim> returnList = new ArrayList<>();
		data.findAll().forEach(obj -> returnList.add(obj));
		return returnList;
	}
	
	@Override
	public ByteArrayInputStream exportAllData() throws Exception{
		
		
		String[] columns = {"ITEM", "PROVINCIA", "NOMBRE DEL CLIENTE", "NÚMERO TELEFÓNICO DE CONTACTO DEL USUARIO","TIPO DE CONEXIÓN","CANAL DE REQUERIMIENTO", "TIPO DE AVERÍA", "FECHA/HORA DE REPORTE", "FECHA/HORA DE REPARACIÓN", "TIEMPO DE REPARACIÓN", "DESCRIPCIÓN DE LA SOLUCIÓN"};
		
		Workbook workbook = new HSSFWorkbook();
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		
		
		Sheet sheet = workbook.createSheet("Reclamos");
		Row row = sheet.createRow(0);
		
		CellStyle style = workbook.createCellStyle();
		HSSFFont font =  (HSSFFont) workbook.createFont();
		font.setBold(true);
		font.setColor(IndexedColors.WHITE.index);
		font.setFontName("Calibri");
		font.setFontHeightInPoints((short) 12);
		style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFont(font);
		
		
		for(int i = 0; i < columns.length; i++) {
			Cell cell=row.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(style);
			sheet.autoSizeColumn(i);
		}
		
		List<Claim> claims= this.getAll();
		int initRow = 1;
		for (Claim claim:claims) {
			row = sheet.createRow(initRow);
			row.createCell(0).setCellValue(claim.getId());
			row.createCell(1).setCellValue(claim.getIdcustomer().getProvince());
			row.createCell(2).setCellValue(claim.getIdcustomer().getName());
			row.createCell(3).setCellValue(claim.getIdcustomer().getPhone());
			row.createCell(4).setCellValue(claim.getIdcustomer().getConnectiontype());
			row.createCell(5).setCellValue(claim.getRequestchannel());
			row.createCell(6).setCellValue(claim.getIdbreakdown());
			row.createCell(7).setCellValue(claim.getDatetimereport());
			row.createCell(8).setCellValue(claim.getDatetimerepair());
			row.createCell(9).setCellValue(claim.getRepairtime());
			row.createCell(10).setCellValue(claim.getSolutiondesc());
			
			initRow++;
		}
		
		workbook.write(stream);
		workbook.close();
		
		return new ByteArrayInputStream(stream.toByteArray());
	}
	

}
