package co.kr.test09upload;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model; // request.setAttribute("key", value)
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;//***

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileUpController {
	
	@RequestMapping("/fileUpload.do")
	public String fileUpLoad() {
		return "fileUpload"; //fileUpload.jsp 뷰 리턴
	}
	
	@RequestMapping(value="/fileUploadPro.do",method=RequestMethod.POST)
	public String fileUploadPro(MultipartHttpServletRequest mRequest,HttpServletRequest request) throws IOException{
		String realPath=request.getSession().getServletContext().getRealPath("/");
		String upPath=realPath+"/resources/shopimgs/";
		//확인위해 
		//upPath="C:\\_upload\\";
		MultipartFile uploadFile=mRequest.getFile("imgFile");
		if(!uploadFile.isEmpty()) {
			String originalFileName=uploadFile.getOriginalFilename(); //원래파일이름
			String ext=FilenameUtils.getExtension(originalFileName); //확장
			UUID uuid=UUID.randomUUID();
			String fileName=uuid+"."+ext;
			uploadFile.transferTo(new File(upPath+originalFileName));
		}
		return "fileUploadSuccess"; //fileUploadSuccess.jsp 뷰리턴
	}
}
