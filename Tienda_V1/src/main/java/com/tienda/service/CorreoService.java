/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import jakarta.mail.MessagingException;

/**
 *
 * @author Hewlett Packard
 */
public interface CorreoService {
    
   public void enviarCorreoHtml(
    
    String para,
    String asunto,
    String contenidoHtml)
           throws MessagingException;
    
    
    
    
}
