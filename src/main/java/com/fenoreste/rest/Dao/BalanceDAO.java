/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fenoreste.rest.Dao;

import com.fenoreste.rest.Entidades.Auxiliares;

/**
 *
 * @author Elliot
 */
public class BalanceDAO extends FacadeBalances<Auxiliares> {
public BalanceDAO() {
	     super(Auxiliares.class);
  }  
}
