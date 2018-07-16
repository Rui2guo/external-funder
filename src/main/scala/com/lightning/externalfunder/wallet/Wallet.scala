package com.lightning.externalfunder.wallet

import fr.acinq.bitcoin._
import scala.concurrent.Future
import com.lightning.externalfunder.Utils.UserId


trait Wallet {
  def rollback(userId: UserId, tx: Transaction): Future[Boolean]
  def commit(userId: UserId, tx: Transaction): Future[Transaction]
}