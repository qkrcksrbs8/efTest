package cg.park.testSpringBoot._2023;

public class ExcelUpload {

//    public Message rouletteExcelUpload(MultipartHttpServletRequest request, int eventSeq) {
//        try {
//            Workbook workbook = WorkbookFactory.create(request.getFile("excelUpload").getInputStream());
//            int sheetCnt  = workbook.getNumberOfSheets();
//            List<EventRoulette> rouletteList = new LinkedList<>();
//
//            List<RouletteProduct> productList = new ArrayList<>();
//
//            for (int sheetNum = 0; sheetNum < sheetCnt; sheetNum++) {
//                Sheet sheet = workbook.getSheetAt(sheetNum);
//                int rows = sheet.getPhysicalNumberOfRows();
//                int prize = 1;
//                Set<Integer> duple = new HashSet<>();
//
//                for (int k = 0; k < 3; k++) {
//                    RouletteProduct product = new RouletteProduct();
//                    product.setEventSeq(eventSeq);
//                    product.setProductSeq(k+1);
//                    product.setProductName(sheet.getRow(k+1).getCell(3).toString());
//                    productList.add(product);
//                }
//
//                for (int i = 1; i < rows; i++) {
//                    EventRoulette er = new EventRoulette();
//                    Row row = sheet.getRow(i);
//                    if (row == null) continue;
//
//                    //2:��÷����  3:��ǰ��
//                    Cell cell = row.getCell(2);
//
//                    if (cell == null)
//                        return new Message(false, "���ε尡 �Ұ����մϴ�. �귿 ��ȣ�� Ȯ�����ּ���.");
//
//                    if (StringUtils.isBlank(cell.toString()))
//                        break;
//
//                    int seq = Integer.parseInt(cellValue(cell));
//                    er.setEventSeq(eventSeq);
//                    er.setPrize(prize);
//                    er.setSeq(seq);
//                    rouletteList.add(er);
//
//                    duple.add(seq);
//
//                    prize++;
//                    if (4 == prize)
//                        prize = 1;
//                }
//
//                if (rouletteList.size() != duple.size())
//                    return new Message(false, "�ߺ��� �귿 ��ȣ�� ����� �� �����ϴ�.");
//            }
//
//            for (EventRoulette r : rouletteList)
//                sst.insert("EventRoulette.insertRouletteSeq", r);
//
//            for (RouletteProduct rp : productList)
//                if (0 == sst.update("EventRoulette.updateRouletteProductName", rp))
//                    sst.insert("EventRoulette.insertRouletteProduct", rp);
//
//            return new Message(true, "OK");
//        }
//        catch (Exception e) {
//            logger.error(e.toString());
//            return new Message(false, "�귿 ��ȣ ��� ��Ŀ� �����ּ���.");
//        }
//    }
//
//    private String cellValue(Cell c) {
//        if (CellType.FORMULA == c.getCellTypeEnum())
//            return c.getCellFormula();
//
//        if (CellType.NUMERIC == c.getCellTypeEnum())
//            return cellNumericValue(c);
//
//        if (CellType.STRING == c.getCellTypeEnum())
//            return c.getStringCellValue();
//
//        return "";
//    }
//
//    private String cellNumericValue(Cell c) {
//        return (DateUtil.isCellDateFormatted(c))
//                ? new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getDateCellValue())
//                : (int) Math.round(c.getNumericCellValue())+"";
//    }

}
